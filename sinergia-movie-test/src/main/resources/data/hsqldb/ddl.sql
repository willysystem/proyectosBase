CREATE TABLE MOVIE (
		ID BIGINT NOT NULL,
		AVERANGE_RATE DOUBLE,
		TITTLE VARCHAR(255)
	);

CREATE TABLE MOVIE_RATINGS (
		MOVIES_ID BIGINT NOT NULL,
		RATINGS_ID BIGINT NOT NULL
	);

CREATE TABLE RATING (
		ID BIGINT NOT NULL,
		DESCRIPTION VARCHAR(255),
		NAME VARCHAR(255)
	);

CREATE TABLE STATE (
		ID BIGINT NOT NULL,
		NAME VARCHAR(255)
	);

CREATE TABLE USER (
		ID BIGINT NOT NULL,
		NAME VARCHAR(255),
		BIRTH_DATE TIMESTAMP,
		STATE_ID BIGINT
	);

CREATE TABLE GENRE_MOVIES (
		GENRES_ID BIGINT NOT NULL,
		MOVIES_ID BIGINT NOT NULL
	);

CREATE TABLE MOVIE_WATCHED (
		ID BIGINT NOT NULL,
		DATE_WATCHED TIMESTAMP,
		RATING DOUBLE,
		MOVIE_ID BIGINT,
		USER_ID BIGINT
	);

CREATE TABLE GENRE (
		ID BIGINT NOT NULL,
		NAME VARCHAR(255)
	);

CREATE UNIQUE INDEX SYS_IDX_SYS_PK_11093_11094 ON MOVIE_RATINGS (MOVIES_ID ASC, RATINGS_ID ASC);

CREATE INDEX SYS_IDX_11118 ON MOVIE_RATINGS (MOVIES_ID ASC);

CREATE INDEX SYS_IDX_11106 ON GENRE_MOVIES (MOVIES_ID ASC);

CREATE INDEX SYS_IDX_11110 ON GENRE_MOVIES (GENRES_ID ASC);

CREATE UNIQUE INDEX SYS_IDX_SYS_PK_11089_11090 ON MOVIE (ID ASC);

CREATE INDEX SYS_IDX_11126 ON USER (STATE_ID ASC);

CREATE UNIQUE INDEX SYS_IDX_SYS_PK_11097_11098 ON MOVIE_WATCHED (ID ASC);

CREATE INDEX SYS_IDX_11122 ON MOVIE_WATCHED (MOVIE_ID ASC);

CREATE UNIQUE INDEX SYS_IDX_SYS_PK_11081_11082 ON GENRE (ID ASC);

CREATE UNIQUE INDEX SYS_IDX_SYS_PK_11103_11104 ON USER (ID ASC);

CREATE INDEX SYS_IDX_11124 ON MOVIE_WATCHED (USER_ID ASC);

CREATE UNIQUE INDEX SYS_IDX_SYS_PK_11099_11100 ON RATING (ID ASC);

CREATE INDEX SYS_IDX_11114 ON MOVIE_RATINGS (RATINGS_ID ASC);

CREATE UNIQUE INDEX SYS_IDX_SYS_PK_11085_11086 ON GENRE_MOVIES (GENRES_ID ASC, MOVIES_ID ASC);

CREATE UNIQUE INDEX SYS_IDX_SYS_PK_11101_11102 ON STATE (ID ASC);

ALTER TABLE MOVIE_RATINGS ADD CONSTRAINT SYS_PK_11093 PRIMARY KEY (MOVIES_ID, RATINGS_ID);

ALTER TABLE GENRE_MOVIES ADD CONSTRAINT SYS_PK_11085 PRIMARY KEY (GENRES_ID, MOVIES_ID);

ALTER TABLE GENRE ADD CONSTRAINT SYS_PK_11081 PRIMARY KEY (ID);

ALTER TABLE RATING ADD CONSTRAINT SYS_PK_11099 PRIMARY KEY (ID);

ALTER TABLE MOVIE_WATCHED ADD CONSTRAINT SYS_PK_11097 PRIMARY KEY (ID);

ALTER TABLE STATE ADD CONSTRAINT SYS_PK_11101 PRIMARY KEY (ID);

ALTER TABLE USER ADD CONSTRAINT SYS_PK_11103 PRIMARY KEY (ID);

ALTER TABLE MOVIE ADD CONSTRAINT SYS_PK_11089 PRIMARY KEY (ID);

ALTER TABLE MOVIE_RATINGS ADD CONSTRAINT FK_1QVVD7CJ70HTH0H1YTBPKHYVO FOREIGN KEY (MOVIES_ID)
	REFERENCES MOVIE (ID);

ALTER TABLE USER ADD CONSTRAINT FK_JIIDFDCWCAV119QTWJ8F5JCKU FOREIGN KEY (STATE_ID)
	REFERENCES STATE (ID);

ALTER TABLE MOVIE_RATINGS ADD CONSTRAINT FK_1HDJKYCV2U1F0OYHGTMKTV3L FOREIGN KEY (RATINGS_ID)
	REFERENCES RATING (ID);

ALTER TABLE GENRE_MOVIES ADD CONSTRAINT FK_NIG51C1318ADEEY5RNUXQ4TJ0 FOREIGN KEY (GENRES_ID)
	REFERENCES GENRE (ID);

ALTER TABLE MOVIE_WATCHED ADD CONSTRAINT FK_828QY2G2XL3IBGO18RP85W4RQ FOREIGN KEY (USER_ID)
	REFERENCES USER (ID);

ALTER TABLE GENRE_MOVIES ADD CONSTRAINT FK_8UVJA3H3S2RPG2DT1EQKKJ1KY FOREIGN KEY (MOVIES_ID)
	REFERENCES MOVIE (ID);

ALTER TABLE MOVIE_WATCHED ADD CONSTRAINT FK_JINHVS1OIN83S7CQW2Q8DYJGC FOREIGN KEY (MOVIE_ID)
	REFERENCES MOVIE (ID);

