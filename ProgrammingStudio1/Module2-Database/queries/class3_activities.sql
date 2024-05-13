--Q1
SELECT * FROM MOVIE;

--Q2
SELECT MVTITLE FROM MOVIE;

--Q3
SELECT Count(*) AS 'Total movies' FROM MOVIE;

--Q4
SELECT mvtitle, mvtype FROM movie WHERE mvtype = 'HORROR';

--Q5
SELECT 
    mvtitle, mvtype, noms 
FROM 
    movie 
WHERE 
    mvtype = 'HORROR' AND noms > 0;
    
--Q6
SELECT 
    mvtitle, mvtype, noms 
FROM 
    movie 
WHERE 
    (mvtype = 'HORROR' AND noms > 0)
    OR
    (mvtype = 'COMEDY')
;

--Q8
SELECT mvtitle, awrd
FROM movie
WHERE awrd > 3;

--Q9
SELECT mvtitle
FROM movie
WHERE mvtitle LIKE '%Nuremberg';
