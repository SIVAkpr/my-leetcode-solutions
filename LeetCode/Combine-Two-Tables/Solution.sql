1/* Write your T-SQL query statement below */
2SELECT p.firstName, p.lastName, a.city, a.state
3FROM Person p 
4LEFT JOIN Address a
5ON p.personId=a.personId;