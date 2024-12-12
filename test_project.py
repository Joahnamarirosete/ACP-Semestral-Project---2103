import pytest
from datetime import datetime
from unittest.mock import patch
from project import Employee, AttendanceSystem

attendance_system = AttendanceSystem()

@pytest.fixture
def sample_employee():
    employee = Employee("Gian Paolo Mulingbayan", 1001)
    attendance_system.add_employee(employee)
    return employee


def test_clock_in(sample_employee):
    sample_employee.clock_in()
    today = datetime.now().date().strftime("%Y-%m-%d")
    assert sample_employee.attendance[today]['clock_in'] is not None


def test_clock_out(sample_employee):
    sample_employee.clock_in()
    sample_employee.clock_out()
    today = datetime.now().date().strftime("%Y-%m-%d")
    assert sample_employee.attendance[today]['clock_out'] is not None


def test_request_leave(sample_employee):
    start_date = "2024-12-15"
    end_date = "2024-12-17"
    reason = "Sick"
    
    sample_employee.request_leave(start_date, end_date, reason)
    assert len(sample_employee.leave_requests) == 1
    assert sample_employee.leave_requests[0]['start_date'] == start_date
    assert sample_employee.leave_requests[0]['end_date'] == end_date
    assert sample_employee.leave_requests[0]['reason'] == reason



def test_manager_authentication():
    assert attendance_system.authenticate_manager("hr123")
    assert not attendance_system.authenticate_manager("wrongpassword")


def test_add_employee():
    new_employee = Employee("Joahna Marie Rosete", 1002)
    attendance_system.add_employee(new_employee)
    assert 1002 in attendance_system.employees
    assert attendance_system.employees[1002].name == "Joahna Marie Rosete"
