SELECT 
    ID, 
    FIRST_NAME, 
    LAST_NAME
FROM 
    CUSTOMER
WHERE 
    LENGTH(FIRST_NAME) + LENGTH(LAST_NAME) < 12
ORDER BY 
    LENGTH(FIRST_NAME) + LENGTH(LAST_NAME), 
    CONCAT(FIRST_NAME, LAST_NAME), 
    ID;
