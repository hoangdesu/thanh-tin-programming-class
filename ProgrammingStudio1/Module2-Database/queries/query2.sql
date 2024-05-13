SELECT Name, CountryCode, Population FROM City;


SELECT Name AS CountryName, Continent, Population -- fields
FROM Country -- table
WHERE Continent = 'Asia'    -- condition, filter
--ORDER BY Population DESC; -- descending: tu lon den be
ORDER BY Population ASC -- ascending: tu be den lon
;

--COUNT(*);
--AVG(FROM:TO);
--SUM(FROM:TO);

/*SELECT 
    CASE */
    

SELECT COUNT(*) AS TotalRepublicCountries 
--SELECT Name, GovernmentForm
FROM Country
WHERE GovernmentForm LIKE '% Republic'
OR GovernmentForm = 'Republic'
;


SELECT Name, MAX(LifeExpectancy)
FROM Country;


SELECT Name, MAX(LifeExpectancy)
FROM Country
WHERE Continent = 'Asia'
;

