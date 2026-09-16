# Write your MySQL query statement below
select patient_id, patient_name, conditions from patients WHERE conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%';