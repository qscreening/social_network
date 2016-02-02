CREATE DATABASE social_network_development;

CREATE TABLE users(
	userId integer(5) primary key not null , 
	userName VARCHAR(10) ,
	email VARCHAR(20) , 
	password VARCHAR(15)
);


CREATE TABLE userProfile(
     userId integer(5) not null, 
     email VARCHAR(20) , 
     Phone BIGINT(15) ,
     image BLOB not null, 
     foreign key (userId) references users(userId)
     );


CREATE TABLE posts(
     userId integer(5) , 
     content VARCHAR(100) , 
     email VARCHAR(15) ,
     foreign key (userId) references users(userId)
     );

CREATE TABLE images(
     userId integer(5) , 
     content VARCHAR(100) , 
     email VARCHAR(15) ,
     foreign key (userId) references users(userId)
     );


CREATE TABLE videos(
     userId integer(5) , 
     content VARCHAR(100) , 
     email VARCHAR(15) ,
     foreign key (userId) references users(userId)
     );


CREATE TABLE links(
     userId integer(5) , 
     content VARCHAR(100) , 
     email VARCHAR(15) ,
     foreign key (userId) references users(userId)
     );


	/* users data */

INSERT INTO users (userId, userName, email,password) VALUES 	
	('1','Surya','thotasuryaprakash246@gmail.com','surya246'),
	('2','Pradeep','pradeeepkmalve@gmail.com','pradeepmalve'),
	('3','Chaitanya','chaitanyaeluri@gmail.com','chaitanya'),
	('4','Kartheek','kartheekchilvery@gmail.com','kartheek'),
	('5','Geethanjali','geetanjali@gmail.com','anjali'),
	('6','Priyanka','priyankasiddana@gmail.com','priyanka');


	/* userProfile data*/	

INSERT INTO userProfile (userId,email,phone,image) VALUES	
	('1','thotasuryaprakash246@gmail.com','9553118466',' '),		  	
	('2','pradeeepkmalve@gmail.com','8019444890',''),
	('3','chaitanyaeluri@gmail.com','1234567890',''),
	('4','kartheekchilvery@gmail.com','1234567890',' '),
	('5','geet2anju@gmail.com','1234567890',''),
	('6','priyankasiddana@gmail.com','123456789',' ');


	/* posts data*/

INSERT INTO posts(userId,content,email)	VALUES
	('1','image','thotasuryaprakash246@gmail.com'),
	('2','image','pradeeepkmalve@gmail.com'),
	('3','image','chaitanyaeluri@gmail.com'),
	('4','video','kartheekchilvery@gmail.com'),
	('5','video','geet2anju@gmail.com'),
	('6','video','priyankasiddana@gmail.com');


	/* group tables */


CREATE TABLE groups(
	groupId integer(10) primary key not null AUTO_INCREMENT,
	groupName VARCHAR(50) not null,
	groupAdmin VARCHAR(50) not null
);

CREATE TABLE groupMembers(
	id integer(10) primary key not null,
	memberId integer(10) not null,
	groupId integer(10) not null,
	groupAdmin Boolean not null,
	foreign key (groupId) references groups(groupId),
	foreign key (memberId) references users(userId)
);





