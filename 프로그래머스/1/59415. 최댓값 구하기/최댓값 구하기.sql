-- 코드를 입력하세요
SELECT DATETIME FROM (
    SELECT ROWNUM, A.* FROM (
        SELECT * FROM ANIMAL_INS
        ORDER BY DATETIME DESC
    ) A
) R
WHERE ROWNUM = 1;