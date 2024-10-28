/*
 * Create a rocky concrete database with integrity constraints. 
 */  

 
/* Remove any existing tables
 * Customers, Products, Orders, Order_details
 * This steps is important if you had stale tables from a previous session
 */
 
PRAGMA foreign_keys = OFF;
drop table if exists order_details;
drop table if exists orders;
drop table if exists products;
drop table if exists customers; 
PRAGMA foreign_keys = ON;
/*  Data Definition */
 
 
CREATE TABLE CUSTOMERS
        (CUST_NO        INTEGER NOT NULL,
        CUST_NAME       VARCHAR(40)     ,
        STREET          VARCHAR(40)     ,
        TOWN            VARCHAR(40)     ,
        POSTCODE        INTEGER         ,
        CR_LIMIT        INTEGER         ,
        CURR_BALANCE    INTEGER         ,
        PRIMARY KEY(CUST_NO)
        )
        WITHOUT ROWID;
 
CREATE TABLE PRODUCTS
        (PROD_COD       VARCHAR(10) NOT NULL,
        DESCRIPTION     VARCHAR(50)     ,
        PROD_GROUP      CHAR(1)         , 
        LIST_PRICE      INTEGER         ,
        QTY_ON_HAND     INTEGER         ,
        REMAKE_LEVEL    INTEGER         ,
        REMAKE_QTY      INTEGER         ,
        PRIMARY KEY (PROD_COD)
        )
        WITHOUT ROWID;
 
CREATE TABLE ORDERS
        (ORDER_NO       INTEGER NOT NULL,
        ORDER_DATE      DATE            ,
        CUST_NO         INTEGER         ,
        PRIMARY KEY (ORDER_NO)          ,
        FOREIGN KEY (CUST_NO) REFERENCES CUSTOMERS(CUST_NO)
        )
        WITHOUT ROWID;
 
CREATE TABLE ORDER_DETAILS
        (ORDER_NO       INTEGER NOT NULL,
        PROD_COD        VARCHAR(10) NOT NULL,
        ORDER_QTY       INTEGER         ,
        ORDER_PRICE     INTEGER         ,
        PRIMARY KEY (ORDER_NO, PROD_COD),
        FOREIGN KEY(ORDER_NO) REFERENCES ORDERS(ORDER_NO),
        FOREIGN KEY (PROD_COD) REFERENCES PRODUCTS(PROD_COD)
        )
        WITHOUT ROWID;



