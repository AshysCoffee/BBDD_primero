SELECT country.Name, countrylanguage.Language
FROM country
JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
WHERE countrylanguage.IsOfficial = 'T';

SELECT city.Name, city.Population
FROM city
JOIN country ON city.CountryCode = country.Code
WHERE country.Name = 'Germany';

SELECT Name, SurfaceArea
FROM country
ORDER BY SurfaceArea ASC
LIMIT 5;


SELECT Name, Population
FROM country
WHERE Population > 50000000
ORDER BY Population DESC;

SELECT Continent, AVG(LifeExpectancy) AS AvgLifeExpectancy
FROM country
GROUP BY Continent;

SELECT Region, SUM(Population) AS TotalPopulation
FROM country
GROUP BY Region;

SELECT country.Name, COUNT(city.ID) AS CityCount
FROM city
JOIN country ON city.CountryCode = country.Code
GROUP BY country.Name
ORDER BY CityCount DESC;


SELECT city.Name AS CityName, country.Name AS CountryName, city.Population
FROM city
JOIN country ON city.CountryCode = country.Code
ORDER BY city.Population DESC
LIMIT 10;

SELECT DISTINCT country.Name
FROM country
JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
WHERE countrylanguage.Language = 'French' AND countrylanguage.IsOfficial = 'T';

SELECT DISTINCT country.Name
FROM country
JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
WHERE countrylanguage.Language = 'English' AND countrylanguage.IsOfficial = 'F';



SELECT Name
FROM country
WHERE Population >= 3 * (SELECT Population FROM country_history WHERE Year = YEAR(CURDATE()) - 50 AND country.Code = country_history.CountryCode);

SELECT Continent, 
       MAX(Name) AS RichestCountry, MAX(GNP) AS HighestGNP, 
       MIN(Name) AS PoorestCountry, MIN(GNP) AS LowestGNP
FROM country
GROUP BY Continent;

SELECT Name, LifeExpectancy
FROM country
WHERE LifeExpectancy < (SELECT AVG(LifeExpectancy) FROM country);

SELECT city.Name AS CapitalCity, country.Name AS CountryName
FROM country
JOIN city ON country.Capital = city.ID
WHERE country.Population > 100000000;

SELECT Continent, COUNT(Name) AS CountryCount
FROM country
GROUP BY Continent
ORDER BY CountryCount DESC
LIMIT 1;
