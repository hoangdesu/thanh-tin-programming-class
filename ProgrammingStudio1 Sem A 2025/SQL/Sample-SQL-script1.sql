-- These SQL queries will only run on Movies database, provided with module 6.

SELECT dirnumb, dirname
    FROM director
    WHERE dirdied IS NOT NULL;
    
SELECT dirnumb, dirname
    FROM director
    WHERE dirdied IS  NULL;
    
SELECT * FROM movie
    WHERE awrd >= 2; 