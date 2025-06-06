SELECT DISTINCT(b.CATEGORY) AS CATEGORY, SUM(s.SALES) AS TOTAL_SALES
FROM BOOK b
LEFT JOIN BOOK_SALES s
ON b.BOOK_ID = s.BOOK_ID
AND LEFT(s.SALES_DATE, 7) = '2022-01' 
GROUP BY b.CATEGORY
ORDER BY b.CATEGORY ASC