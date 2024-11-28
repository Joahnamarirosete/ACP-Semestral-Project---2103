from datetime import datetime, timedelta
import os
from time import sleep


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
        sleep(2)
        os.system('cls')

    def clock_out(self):  
        now = datetime.now()
        date = now.date()
        time = now.time()
        if date in self.attendance:
            self.attendance[date]['clock_out'] = time
            print(f"Clock out at {time} on {date}")
            sleep(2)
            os.system('cls')


   