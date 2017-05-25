
create table USER_(
    ID char(9),
    PASSWORD varchar(20) not null,
    CONSTRAINT USER_PK PRIMARY KEY (ID)
);

create table ACCOUNT_(
    ACCOUNT_ID bigint,
    USER_ID char(9),
    USER_ varchar(100) NOT NULL,
    PASSWORD varchar(20) NOT NULL,
    DESCRIPTION varchar(100),
    PLATFORM varchar(50) NOT NULL,
    CONSTRAINT ACCOUNT_PK PRIMARY KEY (ACCOUNT_ID, USER_ID),	
    CONSTRAINT ACCOUNT_FK FOREIGN KEY (USER_ID) REFERENCES USER_ (ID) on delete cascade
);