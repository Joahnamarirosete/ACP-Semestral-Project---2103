import tkinter as tk
from tkinter import messagebox, ttk
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
        date = now.date()
        time = now.time()
        self.attendance[date] = {'clock_in': time, 'clock_out': None}
        print(f"Clock in at {time} on {date}")

    def clock_out(self):
        now = datetime.now()
        date = now.date()
        time = now.time()
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
                name = employee_data['name']
                employee_id = employee_data['employee_id']

                attendance = {}
                for date_str, record in employee_data['attendance'].items():
                    date = datetime.strptime(date_str, "%Y-%m-%d").date()
                    clock_in_time = datetime.strptime(record['clock_in'], "%H:%M:%S").time() if record['clock_in'] else None
                    clock_out_time = datetime.strptime(record['clock_out'], "%H:%M:%S").time() if record['clock_out'] else None
                    attendance[date] = {'clock_in': clock_in_time, 'clock_out': clock_out_time}

                leave_requests = employee_data['leave_requests']
                leave_status = employee_data['leave_status']

                employee = Employee(name, employee_id)
                employee.attendance = attendance
                employee.leave_requests = leave_requests
                employee.leave_status = leave_status
                self.employees[employee_id] = employee
        except FileNotFoundError:
            pass



    def save_employees(self):
        with open(self.employee_file, 'w') as file:
            data = []
            for employee in self.employees.values():
                attendance = {}
                for date, record in employee.attendance.items():
                    date_str = date.strftime("%Y-%m-%d")
                    clock_in_time = record['clock_in'].strftime("%H:%M:%S") if record['clock_in'] else None
                    clock_out_time = record['clock_out'].strftime("%H:%M:%S") if record['clock_out'] else None
                    attendance[date_str] = {'clock_in': clock_in_time, 'clock_out': clock_out_time}
                

                leave_requests = [
                    {
                        'start_date': req['start_date'],
                        'end_date': req['end_date'],
                        'reason': req['reason']
                    }
                    for req in employee.leave_requests
                ]

                leave_status = {
                    f"{date}": status
                    for date, status in employee.leave_status.items()
                }

                employee_data = {
                    'name': employee.name,
                    'employee_id': employee.employee_id,
                    'attendance': attendance,
                    'leave_requests': leave_requests,
                    'leave_status': leave_status
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
    attendance_system = AttendanceSystem()
    sample_employee = Employee("Gian Paolo Mulingbayan", 1001)
    attendance_system.add_employee(sample_employee)

    sample_employee2 = Employee("Joahna Marie Rosete", 1002)
    attendance_system.add_employee(sample_employee2)

    def __init__(self, root):
        self.root = root
        self.attendance_system = AttendanceSystem()
        self.root.title("Attendance Management System")
        self.main_menu()

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

        tk.Label(leave_window, text="Start Date (YYYY-MM-DD)").pack()
        start_date_entry = tk.Entry(leave_window)
        start_date_entry.pack()

        tk.Label(leave_window, text="End Date (YYYY-MM-DD)").pack()
        end_date_entry = tk.Entry(leave_window)
        end_date_entry.pack()

        tk.Label(leave_window, text="Reason").pack()
        reason_entry = tk.Entry(leave_window)
        reason_entry.pack()

        def submit_leave():
            start_date = start_date_entry.get()
            end_date = end_date_entry.get()
            reason = reason_entry.get()

            if not start_date or not end_date or not reason:
                messagebox.showerror("Error", "All fields are required")
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
        print("Leave request to approve:", leave_request)
        print("Current leave status:", employee.leave_status)

# Check if start_date and end_date are already datetime.date objects
        if isinstance(leave_request['start_date'], str):
            start_date = datetime.strptime(leave_request['start_date'], "%Y-%m-%d").date()
        else:
            start_date = leave_request['start_date']

        if isinstance(leave_request['end_date'], str):
            end_date = datetime.strptime(leave_request['end_date'], "%Y-%m-%d").date()
        else:
            end_date = leave_request['end_date']

# Convert the keys to datetime.date objects
        leave_status = {
            (datetime.strptime(start_end.split('_')[0], "%Y-%m-%d").date(),
            datetime.strptime(start_end.split('_')[1], "%Y-%m-%d").date()): status
            for start_end, status in employee.leave_status.items()      
        }

# Add these print statements
        print("Checking leave request:", (start_date, end_date))
        print("Leave status keys:", leave_status.keys())

# Ensure the leave request exists in the leave_status
        if (start_date, end_date) in leave_status and leave_status[(start_date, end_date)] == "Pending":
            leave_status[(start_date, end_date)] = "Approved"
            employee.leave_status = {
                f"{start_end[0].strftime('%Y-%m-%d')}_{start_end[1].strftime('%Y-%m-%d')}": status
                for start_end, status in leave_status.items()
            }
            self.attendance_system.save_employees
            print("Leave status updated to Approved")
            print("Leave status keys:", employee.leave_status)
    
    # Mark the attendance for the requested leave days
            current_date = start_date
            while current_date <= end_date:
                employee.attendance[current_date] = {'clock_in': 'On Leave', 'clock_out': 'On Leave'}
                current_date += timedelta(days=1)
    
            self.attendance_system.save_employees  # Save after approval
            print(f"Leave approved from {start_date} to {end_date}.")
            messagebox.showinfo("Success", f"Approved leave for {employee.name}")
        else:
            messagebox.showerror("Error", "No matching leave request found or it is not pending.")

    def deny_leave(self, employee, leave_request):
        print("Leave request to deny:", leave_request)
        print("Current leave status:", employee.leave_status)

    # Check if start_date and end_date are already datetime.date objects
        if isinstance(leave_request['start_date'], str):
            start_date = datetime.strptime(leave_request['start_date'], "%Y-%m-%d").date()
        else:
            start_date = leave_request['start_date']

        if isinstance(leave_request['end_date'], str):
            end_date = datetime.strptime(leave_request['end_date'], "%Y-%m-%d").date()
        else:
            end_date = leave_request['end_date']

    # Ensure the leave request exists in the leave_status
        if (start_date, end_date) in employee.leave_status and employee.leave_status[(start_date, end_date)] == "Pending":
            employee.leave_status[(start_date, end_date)] = "Denied"
            self.save_employees()  # Save after denial
            print(f"Leave denied from {start_date} to {end_date}.")
            messagebox.showinfo("Success", f"Denied leave for {employee.name}")
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

                    attendance = employee.attendance.get(date, {'clock_in': None, 'clock_out': None})
                    clock_in = attendance['clock_in'] if attendance['clock_in'] else "N/A"
                    clock_out = attendance['clock_out'] if attendance['clock_out'] else "N/A"
                    tree.insert("", "end", values=(employee.name, date, clock_in, clock_out))

        tk.Button(self.root, text="Generate Report", command=generate_report, width=20, height=2).pack(pady=5)
        tk.Button(self.root, text="Back", command=self.hr_menu, width=20, height=2).pack(pady=10)


if __name__ == "__main__":
    root = tk.Tk()
    app = AttendanceApp(root)
    root.mainloop()