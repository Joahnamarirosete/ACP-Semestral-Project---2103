import project
from datetime import datetime, timedelta
from project import Employee, AttendanceSystem

def test_clock_in():
    employee = Employee("Test Employee", 101)
    employee.clock_in()
    today = datetime.now().date()
    assert today in employee.attendance
    assert employee.attendance[today]["clock_in"] is not None
    assert employee.attendance[today]["clock_out"] is None

def test_request_leave():
    employee = Employee("Test Employee", 102)
    start_date = datetime(2023, 11, 1).date()
    end_date = datetime(2023, 11, 5).date()
    reason = "Vacation"
    employee.request_leave(start_date, end_date, reason)
    
    assert (start_date, end_date) in employee.leave_status
    assert employee.leave_status[(start_date, end_date)] == "Pending"
    assert len(employee.leave_requests) == 1
    assert employee.leave_requests[0] == {
        "start_date": start_date,
        "end_date": end_date,
        "reason": reason
    }

def test_generate_attendance_report():
    employee = Employee("Test Employee", 103)
    start_date = datetime(2023, 11, 1).date()
    end_date = datetime(2023, 11, 5).date()
    

    employee.attendance[start_date] = {'clock_in': "09:00 AM", 'clock_out': "05:00 PM"}
    employee.attendance[start_date + timedelta(days=1)] = {'clock_in': "09:15 AM", 'clock_out': "05:15 PM"}
    
    report = employee.generate_attendance_report(start_date, end_date)
    
    assert report[start_date]["clock_in"] == "09:00 AM"
    assert report[start_date]["clock_out"] == "05:00 PM"
    assert report[start_date + timedelta(days=1)]["clock_in"] == "09:15 AM"
    assert report[start_date + timedelta(days=1)]["clock_out"] == "05:15 PM"
    assert report[start_date + timedelta(days=2)] == {'clock_in': None, 'clock_out': None}


if __name__ == "__main__":
    project.main()
