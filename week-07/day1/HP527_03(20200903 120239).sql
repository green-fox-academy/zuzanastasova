SELECT 
	mID, 
	title 
FROM 
	movie 
WHERE 
	director = "Steven Spielberg";

SELECT DISTINCT 
	year 
FROM 
	movie 
JOIN 
	rating on movie.mID = rating.mID 
WHERE 
	rating.stars >= 4 
ORDER BY 
	movie.year asc;

SELECT 
	title 
FROM 
	movie 
WHERE 
	mID NOT IN (
		SELECT 
			mID 
		FROM 
			rating);

SELECT DISTINCT 
	name 
FROM 
	reviewer 
JOIN 
	rating on reviewer.rID = rating.rID 
WHERE 
	rating.ratingDate is NULL;

SELECT 
	reviewer.name, 
	movie.title, 
	rating.stars, 
    rating.ratingdate 
FROM 
	movie 
JOIN 
	rating on movie.mID = rating.mID 
JOIN 
	reviewer on rating.rID = reviewer.rID 
ORDER BY 
	reviewer.name, 
    movie.title, 
    rating.stars;

select
    title,
    name, 
    (select stars from rating where rating.ratingDate = tempTable.firstRatingDate and rating.mID = tempTable.mID and rating.rID = tempTable.rID) as firstStars,
    (select stars from rating where rating.ratingDate = tempTable.latestRatingDate and rating.mID = tempTable.mID and rating.rID = tempTable.rID) as lastStars
from (
    select title,
        name,
        movie.mID,
        rating.rID,
        max(ratingDate) as latestRatingDate,
        min(ratingDate) as firstRatingDate,
        count(ratingDate) as rateCount
     from movie
        left join rating on rating.mID = movie.mID
        left join reviewer on rating.rID = reviewer.rID
        group by title, name, mID, rID
        having rateCount > 1
        ) tempTable
	having 
    lastStars > firstStars;
    

    