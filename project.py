import tkinter as tk
from tkinter import messagebox, ttk
from tkcalendar import Calendar
from datetime import datetime, timedelta
import json
import calendar

class Employee:
    def __init__(self, name, employee_id):                                   
        self.name = name
        self.employee_id = employee_id
        self.attendance = {}
        self.leave_requests = []
        self.leave_status = {}

    def clock_in(self):
        now = datetime.now()
        date = now.date().strftime("%Y-%m-%d")
        time = now.time().strftime("%H:%M:%S")
        self.attendance[date] = {'clock_in': time, 'clock_out': None}
        print(f"Clock in at {time} on {date}")

    def clock_out(self):
        now = datetime.now()
        date = now.date().strftime("%Y-%m-%d")
        time = now.time().strftime("%H:%M:%S")
        if date in self.attendance:
            self.attendance[date]['clock_out'] = time
            print(f"Clock out at {time} on {date}")

    def request_leave(self, start_date, end_date, reason):
        leave_period = {'start_date': start_date, 'end_date': end_date, 'reason': reason}
        self.leave_requests.append(leave_period)
        self.leave_status[f"{start_date}_{end_date}"] = "Pending"
        print(self.leave_requests)
        print(self.leave_status)
        print(f"Leave requested from {start_date} to {end_date} for reason: {reason}")

    def generate_attendance_report(self, start_date, end_date):
        report = {}
        current_date = start_date
        while current_date <= end_date:
            if current_date in self.attendance:
                report[current_date] = self.attendance[current_date]
            else:
                report[current_date] = {'clock_in': None, 'clock_out': None}
            current_date += timedelta(days=1)
        return report

    def get_leave_requests(self):
        return self.leave_requests

    def view_leave_status(self):
        if self.leave_status:
            for (start_date, end_date), status in self.leave_status.items():
                print(f"Leave request from {start_date} to {end_date}: {status}")
        else:
            print("No leave requests submitted.")


class AttendanceSystem:
    MAX_LEAVE_DAYS = 5  # Define the maximum number of leave days

    def __init__(self):
        self.employees = {}
        self.manager_authenticated = False
        self.employee_file = r"C:\Users\Windows\Desktop\Python Project\employees.json"
        self.load_employees()

    def load_employees(self):
        try:
            with open(self.employee_file, 'r') as file:
                data = json.load(file)
                for employee_data in data:
                    employee = Employee(employee_data['name'], employee_data['employee_id'])
                    employee.attendance = employee_data['attendance']
                    employee.leave_requests = employee_data['leave_requests']
                    employee.leave_status = employee_data['leave_status']
                    self.employees[employee.employee_id] = employee
        except FileNotFoundError:
            pass



    def save_employees(self):
        with open(self.employee_file, 'w') as file:
            data = []
            for employee in self.employees.values():
                employee_data = {
                    'name': employee.name,
                    'employee_id': employee.employee_id,
                    'attendance': employee.attendance,
                    'leave_requests': employee.leave_requests,
                    'leave_status': employee.leave_status
                }
                data.append(employee_data)
            json.dump(data, file, indent=2)



    def add_employee(self, employee):
        if employee.employee_id not in self.employees:
            self.employees[employee.employee_id] = employee
            self.save_employees()

    def get_employee(self, employee_id):
        return self.employees.get(employee_id)

    def authenticate_manager(self, password):
        return password == "hr123"

    def set_manager_authenticated(self, value):
        self.manager_authenticated = value

    def is_manager_authenticated(self):
        return self.manager_authenticated

    def get_all_employees(self):
        return self.employees.values()


class AttendanceApp:
    def __init__(self, root):
        self.root = root
        self.attendance_system = AttendanceSystem()
        self.root.title("Attendance Management System")
        self.main_menu()
        
        sample_employee = Employee("Gian Paolo Mulingbayan", 1001)
        self.attendance_system.add_employee(sample_employee)

        sample_employee2 = Employee("Joahna Marie Rosete", 1002)
        self.attendance_system.add_employee(sample_employee2)

    def main_menu(self):
        self.clear_screen()
        tk.Label(self.root, text="Attendance Management System", font=("Arial", 16), width=40, height=2).pack(pady=10)
        tk.Button(self.root, text="Employee Login", command=self.employee_login, width=30, height=2).pack(pady=5)
        tk.Button(self.root, text="Human Resources", command=self.hr_login, width=30, height=2).pack(pady=5)
        tk.Button(self.root, text="Exit", command=self.root.quit, width=30, height=2).pack(pady=5)

    def employee_login(self):
        self.clear_screen()
        tk.Label(self.root, text="Employee Login", font=("Arial", 16), width=40, height=2).pack(pady=10)
        tk.Label(self.root, text="Employee ID:", font=("Arial", 10), width=35, height=2).pack()

        emp_id_entry = tk.Entry(self.root, font=("Arial", 10), width=15)
        emp_id_entry.pack(pady=5)

        def login():
            emp_id = emp_id_entry.get()
            if not emp_id.isdigit():
                messagebox.showerror("Error", "Invalid Employee ID")
                return
            employee = self.attendance_system.get_employee(int(emp_id))
            if employee:
                self.employee_menu (employee)
            else:
                response = messagebox.askyesno("Employee Not Found", "Employee ID not found. Would you like to register?")
                if response:
                    self.register_employee(int(emp_id))
                else:
                    self.main_menu()

        tk.Button(self.root, text="Login", command=login, width=20, height=2).pack(pady=5)
        tk.Button(self.root, text="Back", command=self.main_menu, width=20, height=2).pack(pady=5)

    def register_employee(self, emp_id):
        self.clear_screen()
        tk.Label(self.root, text="Register New Employee", font=("Arial", 16), width=40, height=2).pack(pady=10)
        tk.Label(self.root, text="Employee Name:", font=("Arial", 10), width=35, height=2).pack()

        emp_name_entry = tk.Entry(self.root, font=("Arial", 10), width=20)
        emp_name_entry.pack(pady=5)

        def submit_registration():
            emp_name = emp_name_entry.get().strip()
            if not emp_name:
                messagebox.showerror("Error", "Employee name cannot be empty")
                return
            new_employee = Employee(emp_name, emp_id)
            self.attendance_system.add_employee(new_employee)
            messagebox.showinfo("Success", "Employee registered successfully!")
            self.main_menu()

        tk.Button(self.root, text="Register", command=submit_registration, width=20, height=2).pack(pady=5)
        tk.Button(self.root, text="Back", command=self.main_menu, width=20, height=2).pack(pady=5)

    def employee_menu(self, employee):
        self.clear_screen()
        tk.Label(self.root, text=f"Welcome, {employee.name}", font=("Arial", 14), width=40, height=2).pack(pady=10)
        tk.Button(self.root, text="Clock In", command=lambda: self.clock_in(employee), width=20, height=2).pack(pady=5)
        tk.Button(self.root, text="Clock Out", command=lambda: self.clock_out(employee), width=20, height=2).pack(pady=5)
        tk.Button(self.root, text="Request Leave", command=lambda: self.request_leave(employee), width=20, height=2).pack(pady=5)
        tk.Button(self.root, text="View Leave Status", command=lambda: self.view_leave_status(employee), width=20, height=2).pack(pady=5)
        tk.Button(self.root, text="Back", command=self.main_menu, width=20, height=2).pack(pady=5)

    def clock_in(self, employee):
        employee.clock_in()
        self.attendance_system.save_employees()
        messagebox.showinfo("Success", "Clocked In Successfully")

    def clock_out(self, employee):
        employee.clock_out()
        self.attendance_system.save_employees()
        messagebox.showinfo("Success", "Clocked Out Successfully")

    def request_leave(self, employee):
        leave_window = tk.Toplevel(self.root)
        leave_window.title("Request Leave")

        tk.Label(leave_window, text="Start Date").pack()
        start_date_calendar = Calendar(leave_window, date_pattern="yyyy-mm-dd")
        start_date_calendar.pack()

        tk.Label(leave_window, text="End Date").pack()
        end_date_calendar = Calendar(leave_window, date_pattern="yyyy-mm-dd")
        end_date_calendar.pack()

        tk.Label(leave_window, text="Reason").pack()
        reason_entry = tk.Entry(leave_window)
        reason_entry.pack()

        def submit_leave():
            start_date = start_date_calendar.get_date()
            end_date = end_date_calendar.get_date()
            reason = reason_entry.get()

            if not reason:
                messagebox.showerror("Error", "Reason is required")
                return

            try:
                start = datetime.strptime(start_date, "%Y-%m-%d").date()
                end = datetime.strptime(end_date, "%Y-%m-%d").date()
                if start > end:
                    raise ValueError("Start date must be before end date.")
            except ValueError as e:
                messagebox.showerror("Error", f"Invalid date: {e}")
                return

            employee.request_leave(start_date, end_date, reason)
            self.attendance_system.save_employees()
            messagebox.showinfo("Success", "Leave Request Submitted")
            leave_window.destroy()

        tk.Button(leave_window, text="Submit", command=submit_leave).pack(pady=5)

    def clear_screen(self):
        for widget in self.root.winfo_children():
            widget.destroy()
            
    def view_leave_status(self, employee):
    # Create a new window to display the leave status
        leave_status_window = tk.Toplevel(self.root)
        leave_status_window.title("Leave Status")
    
    # Create a header label
        tk.Label(leave_status_window, text="Leave Requests Status", font=("Arial", 14)).pack(pady=10)
    
    # Create a treeview to display leave request details
        columns = ("Start Date", "End Date", "Reason", "Status")
        tree = ttk.Treeview(leave_status_window, columns=columns, show="headings")
        tree.pack(pady=10, padx=10, fill=tk.BOTH, expand=True)
    
    # Set the column headers
        for col in columns:
            tree.heading(col, text=col)
            tree.column(col, width=150)

    # Add leave requests to the treeview
        for leave_request in employee.leave_requests:
            start_date = leave_request['start_date']
            end_date = leave_request['end_date']
            reason = leave_request['reason']
            status = employee.leave_status.get(f"{start_date}_{end_date}", "Pending")
            tree.insert("", "end", values=(start_date, end_date, reason, status))
        
    
    # Add a button to close the window
        tk.Button(leave_status_window, text="Close", command=leave_status_window.destroy).pack(pady=10)

    def hr_login(self):
        self.clear_screen()
        tk.Label(self.root, text="HR Login", font=("Arial", 16), width=40, height=2).pack(pady=5)
        tk.Label(self.root, text="Password:", font=("Arial", 13), width=35, height=2).pack()

        password_entry = tk.Entry (self.root, font=("Arial", 10), width=30, show="*")  # Hide the password
        password_entry.pack(pady=5)

        def authenticate():
            password = password_entry.get()
            if self.attendance_system.authenticate_manager(password):
                self.attendance_system.set_manager_authenticated(True)
                self.hr_menu()  # Navigate to HR menu if authentication is successful
            else:
                messagebox.showerror("Error", "Invalid password")

        tk.Button(self.root, text="Login", command=authenticate, width=20, height=2).pack(pady=5)
        tk.Button(self.root, text="Back", command=self.main_menu, width=20, height=2).pack(pady=5)

    def hr_menu(self):
        self.clear_screen()
        tk.Label(self.root, text="HR Menu", font=("Arial", 16), width=40, height=2).pack(pady=10)
        tk.Button(self.root, text="Approve Leave Requests", command=self.approve_leave_requests, width=30, height=2).pack(pady=5)
        tk.Button(self.root, text="View Attendance Report", command=self.view_attendance_report, width=30, height=2).pack(pady=5)
        tk.Button(self.root, text="Back", command=self.main_menu, width=30, height=2).pack(pady=5)

    def approve_leave_requests(self):
        self.clear_screen()
        tk.Label(self.root, text="Approve Leave Requests", font=("Arial", 16), width=40, height=2).pack(pady=10)
        tk.Button(self.root, text="Back", command=self.hr_menu, width=20, height=2).pack(pady=10)

        for employee in self.attendance_system.get_all_employees():
            for leave_request in employee.get_leave_requests():
                frame = tk.Frame(self.root)
                frame.pack(pady=5)

                tk.Label(frame, text=f"{employee.name}: {leave_request['start_date']} to {leave_request['end_date']} - {leave_request['reason']}").pack(side=tk.LEFT)
                
                # Pass the specific employee and leave_request using default arguments
                tk.Button(frame, text="Approve", 
                        command=lambda emp=employee, req=leave_request:self.approve_leave(emp, req)).pack(side=tk.LEFT, padx=5)
                tk.Button(frame, text="Deny", 
                        command=lambda emp=employee, req=leave_request: self.deny_leave(emp, req)).pack(side=tk.LEFT, padx=5)

    def approve_leave(self, employee, leave_request):
        key = f"{leave_request['start_date']}_{leave_request['end_date']}"

        
        if key in employee.leave_status:
            employee.leave_status[key] = "Approved"
            
            start_date = datetime.strptime(leave_request['start_date'], "%Y-%m-%d").date()
            end_date = datetime.strptime(leave_request['end_date'], "%Y-%m-%d").date()
            
            current_date = start_date
            while current_date <= end_date:
                employee.attendance[current_date.strftime("%Y-%m-%d")] = {'clock_in': 'On Leave', 'clock_out': 'On Leave'}
                current_date += timedelta(days=1)
            
            employee.leave_requests = [req for req in employee.leave_requests if req['start_date'] != leave_request['start_date'] or req['end_date'] != leave_request['end_date']]
                
            self.attendance_system.save_employees()
            messagebox.showinfo("Success", f"Approved leave for {employee.name}")
            print("Leave request approved.")
            self.hr_menu() 
            return
        else:
            print("Leave request not found.")


    def deny_leave(self, employee, leave_request):
        key = f"{leave_request['start_date']}_{leave_request['end_date']}"

        if key in employee.leave_status:
            employee.leave_status[key] = "Denied"
            
            employee.leave_requests = [req for req in employee.leave_requests if req['start_date'] != leave_request['start_date'] or req['end_date'] != leave_request['end_date']]
                
            self.attendance_system.save_employees()
            
            messagebox.showinfo("Success", f"Denied leave for {employee.name}")
            self.hr_menu()
        else:
            messagebox.showerror("Error", "No matching leave request found or it is not pending.")
        


    def view_attendance_report(self):
        self.clear_screen()
        tk.Label(self.root, text="Attendance Report", font=("Arial", 16), width=40, height=2).pack(pady=10)

        current_month = datetime.now().strftime("%Y-%m")  # Get current month and year as YYYY-MM

        tk.Label(self.root, text="Enter Year and Month (YYYY-MM):", font=("Arial", 12)).pack(pady=5)

        month_year_entry = tk.Entry(self.root, font=("Arial", 10), width=20)
        month_year_entry.insert(0, current_month)  # Set the default value to current month
        month_year_entry.pack(pady=5)

        columns = ("Name", "Date", "Clock In", "Clock Out")
        tree = ttk.Treeview(self.root, columns=columns, show="headings", height=20)
        tree.pack(pady=10)

        for col in columns:
            tree.heading(col, text=col)
            tree.column(col, width=100)

        def generate_report():
            month_year = month_year_entry.get()

            try:
                selected_month = datetime.strptime(month_year, "%Y-%m")
            except ValueError:
                messagebox.showaError("Error", "Invalid date format. Please use YYYY-MM.")
                return

            year = selected_month.year
            month = selected_month.month
            num_days = calendar.monthrange(year, month)[1]

            for item in tree.get_children():
                tree.delete(item)

            for employee in self.attendance_system.get_all_employees():
                for day in range(1, num_days + 1):
                    date = datetime(year, month, day).date()

                    attendance = employee.attendance.get(date.strftime("%Y-%m-%d"), {'clock_in': None, 'clock_out': None})
                    clock_in = attendance['clock_in'] if attendance['clock_in'] else "N/A"
                    clock_out = attendance['clock_out'] if attendance['clock_out'] else "N/A"
                    tree.insert("", "end", values=(employee.name, date, clock_in, clock_out))

        tk.Button(self.root, text="Generate Report", command=generate_report, width=20, height=2).pack(pady=5)
        tk.Button(self.root, text="Back", command=self.hr_menu, width=20, height=2).pack(pady=10)


if __name__ == "__main__":
    root = tk.Tk()
    app = AttendanceApp(root)
    root.mainloop()
