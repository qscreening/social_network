CREATE DATABASE social_network_development;
use social_network_development;

CREATE TABLE users(
	userId integer(5) primary key NOT NULL AUTO_INCREMENT , 
	userName VARCHAR(10) ,
<<<<<<< HEAD
	email VARCHAR(20) , 
	password VARCHAR(50),
	unique(email)
=======
	email VARCHAR(30) not null , 
	password VARCHAR(20) not null,
	primary key(userId),
        unique(email)
>>>>>>> 632ae3263df43472c0e6dda5200a2491c850221c
);


CREATE TABLE userProfiles(
<<<<<<< HEAD
     userId integer(5) NOT NULL AUTO_INCREMENT, 
     email VARCHAR(20) , 
     Phone BIGINT(15) ,
     image BLOB not null, 
     foreign key (userId) references users(userId)
=======
	id integer (10) not null AUTO_INCREMENT,
	userId integer(5), 
	email VARCHAR(30) not null , 
	Phone BIGINT(15) ,
	primary key(id),
	foreign key (userId) references users(userId)
>>>>>>> 632ae3263df43472c0e6dda5200a2491c850221c
     );


CREATE TABLE posts(
<<<<<<< HEAD
     userId integer(5) NOT NULL AUTO_INCREMENT, 
     content VARCHAR(100) , 
     email VARCHAR(15) ,
     foreign key (userId) references users(userId)
     );

CREATE TABLE images(
     userId integer(5) NOT NULL AUTO_INCREMENT, 
     content VARCHAR(100) , 
     email VARCHAR(15) ,
     foreign key (userId) references users(userId)
=======
	userId integer(5) , 
	content VARCHAR(100) , 
	email VARCHAR(30) not null ,
	foreign key (userId) references users(userId)
     );

CREATE TABLE images(
	userId integer(5) , 
	content VARCHAR(100) , 
	email VARCHAR(30) not null,
	foreign key (userId) references users(userId)
>>>>>>> 632ae3263df43472c0e6dda5200a2491c850221c
     );


CREATE TABLE videos(
<<<<<<< HEAD
     userId integer(5) NOT NULL AUTO_INCREMENT , 
     content VARCHAR(100) , 
     email VARCHAR(15) ,
     foreign key (userId) references users(userId)
=======
	userId integer(5) , 
	content VARCHAR(100) , 
	email VARCHAR(30) not null ,
	foreign key (userId) references users(userId)
>>>>>>> 632ae3263df43472c0e6dda5200a2491c850221c
     );


CREATE TABLE links(
<<<<<<< HEAD
     userId integer(5) NOT NULL AUTO_INCREMENT , 
     content VARCHAR(100) , 
     email VARCHAR(15) ,
     foreign key (userId) references users(userId)
     );
=======
	userId integer(5) , 
	content VARCHAR(100) , 
	email VARCHAR(30) not null,
	foreign key (userId) references users(userId)
	);
>>>>>>> 632ae3263df43472c0e6dda5200a2491c850221c


	/* users data */

INSERT INTO users (userId, userName, email,password) VALUES 	
	('1','Surya','thotasuryaprakash246@gmail.com','surya246'),
	('2','Pradeep','pradeeepkmalve@gmail.com','pradeepmalve'),
	('3','Chaitanya','chaitanyaeluri@gmail.com','chaitanya'),
	('4','Kartheek','kartheekchilvery@gmail.com','kartheek'),
	('5','Geethanjali','geetanjali@gmail.com','anjali'),
	('6','Priyanka','priyankasiddana@gmail.com','priyanka');


	/* userProfile data*/	

<<<<<<< HEAD
INSERT INTO userProfiles (userId,email,phone,image) VALUES	
	('1','thotasuryaprakash246@gmail.com','9553118466',' '),		  	
	('2','pradeeepkmalve@gmail.com','8019444890',''),
	('3','chaitanyaeluri@gmail.com','1234567890',''),
	('4','kartheekchilvery@gmail.com','1234567890',' '),
	('5','geet2anju@gmail.com','1234567890',''),
	('6','priyankasiddana@gmail.com','123456789',' ');
=======

INSERT INTO userProfiles (userId,email,phone,image) VALUES	
	('1','thotasuryaprakash246@gmail.com','9553118466'),		  	
	('2','pradeeepkmalve@gmail.com','8019444890'),
	('3','chaitanyaeluri@gmail.com','1234567890'),
	('4','kartheekchilvery@gmail.com','1234567890'),
	('5','geet2anju@gmail.com','1234567890'),
	('6','priyankasiddana@gmail.com','123456789');
>>>>>>> 632ae3263df43472c0e6dda5200a2491c850221c


	/* posts data*/

INSERT INTO posts(userId,content,email)	VALUES
	('1','image','thotasuryaprakash246@gmail.com'),
	('2','image','pradeeepkmalve@gmail.com'),
	('3','image','chaitanyaeluri@gmail.com'),
	('4','video','kartheekchilvery@gmail.com'),
	('5','video','geet2anju@gmail.com'),
	('6','video','priyankasiddana@gmail.com');

<<<<<<< HEAD


	/* groups tables */


=======
	
>>>>>>> 632ae3263df43472c0e6dda5200a2491c850221c
CREATE TABLE groups(
	groupId integer(10) primary key not null AUTO_INCREMENT,
	groupName VARCHAR(50) not null,
	groupAdmin integer(5) not null,
	foreign key (groupAdmin) references users(userId)
);

CREATE TABLE groupMembers(
	id integer(10) primary key not null AUTO_INCREMENT,
	memberId integer(10) not null,
	groupId integer(10) not null,
	groupAdmin Boolean not null,
	foreign key (groupId) references groups(groupId),
	foreign key (memberId) references users(userId)
);

INSERT INTO groups(groupName,groupAdmin) values
	("social_network", 1),
	("project_management", 4);
 INSERT INTO groupMembers(groupId, memberId, groupAdmin) values
	(1, 1, 1),
	(1, 2, 0),
	(1, 3, 0),
	(2, 4, 1),
	(2, 5, 0),
	(2, 6, 0);
	






