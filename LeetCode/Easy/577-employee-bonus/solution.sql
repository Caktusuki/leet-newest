select name,b.bonus from Employee as emp LEFT Join Bonus as b on emp.empId=b.empId where b.bonus<1000 or b.bonus is null; 
