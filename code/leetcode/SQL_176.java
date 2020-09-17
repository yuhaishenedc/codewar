package leetcode;

public class SQL_176 {
    /*

    solution 1:

    select max(Salary) as SecondHighestSalary
    from Employee
    where Salary<(
        select max(Salary)
        from Employee
    );

    solution 2:

    select(
        select distinct Salary
        from Employee
        order by Salary desc
        limit 1 offset 1
    )as SecondHighestSalary;

     */
}
