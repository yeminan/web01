create database myshop;
commit;
use myshop;
create table member(
id varchar(20),
pwd varchar(500) not null,
uname varchar(20) not null,
birth date,
phone varchar(20) not null,
email varchar(100) not null,
regdate date default(current_date),
primary key(id),unique key(email),unique key(phone)
);

select * from member;

insert into member (id,pwd,uname,birth,phone,email)value('admin','1234','관리자','2022-06-28','010-0001-0001','admin@naver.com');
insert into member (id,pwd,uname,birth,phone,email)value('LMH','1111','이민환','2021-01-11','010-0002-0002','LMH@naver.com');
insert into member (id,pwd,uname,birth,phone,email)value('paik','2222','백종원','1970-02-22','010-0003-0003','paik@naver.com');
insert into member (id,pwd,uname,birth,phone,email)value('son','7777','손흥민','1980-03-31','010-0004-0004','son@naver.com');
insert into member (id,pwd,uname,birth,phone,email)value('jo','1234','조심해','2000-01-18','010-0005-0005','jo@naver.com');
select * from member;
delete from member where id='admin';

create table cfbean( cno int primary key auto_increment,
ccode int,
ctitle varchar(50),
cprice int,
camount int,
cimg varchar(500),
ccontent varchar(2000),
cweight varchar(50),
cdegree varchar(200));
 drop table cfbean;
desc cfbean;
select * from cfbean;
insert into cfbean(ccode,ctitle,cprice,camount,cimg,ccontent,cweight,cdegree)value(1,'온두라스파카스내추럴',20000,20,'img/cf1/jpg','원두의 신선함을 유지할 수 있도록 안전하게 포장해서 신속히 보내드립니다.','200g','원두');
insert into cfbean(ccode,ctitle,cprice,camount,cimg,ccontent,cweight,cdegree)value(2,'산미적은원두추천',13000,10,'img/cf3/jpg','원두의 신선함을 유지할 수 있도록 안전하게 포장해서 신속히 보내드립니다.','500g','프렌치프레스');
insert into cfbean(ccode,ctitle,cprice,camount,cimg,ccontent,cweight,cdegree)value(3,'산미좋은원두추천',15000,15,'img/cf10/jpg','원두의 신선함을 유지할 수 있도록 안전하게 포장해서 신속히 보내드립니다.','1kg','핸드드립');
insert into cfbean(ccode,ctitle,cprice,camount,cimg,ccontent,cweight,cdegree)value(4,'디카페인콜롬비아',14000,30,'img/cf11/jpg','원두의 신선함을 유지할 수 있도록 안전하게 포장해서 신속히 보내드립니다.','200g','모카포트');
insert into cfbean(ccode,ctitle,cprice,camount,cimg,ccontent,cweight,cdegree)value(5,'원두케냐AATOP티카기키',16000,5,'img/cf12/jpg','원두의 신선함을 유지할 수 있도록 안전하게 포장해서 신속히 보내드립니다.','500g','에스프레소');


create table payment(
cno int primary key auto_increment,
paytype varchar(20),
payno varchar(30),
money int,
cdate date default (current_date),
ccode int,
amount int,
userid varchar(20),
rname varchar(30),
tel varchar(20),
addr1 varchar(200),
addr2 varchar(100),
postcode varchar(10),
transno varchar(50),
transco varchar(50),
rstatus varchar(20),
rdate date);
desc payment;
select * from payment;
commit;
drop table payment;

create table basket(ccno int auto_increment primary key,
cno int,
ccode int,
id varchar(30),
ctitle varchar(50),
cprice int,
camount int,
cweight varchar(50),
cdegree varchar(200),
cimg varchar(500));

insert into basket(ccode,ctitle,cprice,camount,cimg)value(1,'온두라스파카스내추럴',20000,20,'img/cf1/jpg');
insert into basket(ccode,ctitle,cprice,camount,cimg)value(2,'산미적은원두추천',13000,10,'img/cf3/jpg');
insert into basket(ccode,ctitle,cprice,camount,cimg)value(3,'산미좋은원두추천',15000,15,'img/cf10/jpg');
insert into basket(ccode,ctitle,cprice,camount,cimg)value(4,'디카페인콜롬비아',14000,30,'img/cf11/jpg');
insert into basket(ccode,ctitle,cprice,camount,cimg)value(5,'dlalsghks123','원두케냐AATOP티카기키',16000,5,'img/cf12/jpg');
commit;
desc basket;
select * from basket;
drop table basket;

create table notice(seq int primary key auto_increment,
title varchar(50),
content varchar(400),
nickname varchar(30),
regdate date default(current_date),
visited int
);
desc basket;
drop table notice;
insert into notice (seq,title,content,nickname,visited) value(1,'게시판제목1입니다','게시판내용1입니다','admin',0);
insert into notice (seq,title,content,nickname,visited) value(2,'게시판제목2입니다','게시판내용2입니다','LMH',1);
insert into notice (seq,title,content,nickname,visited) value(3,'게시판제목3입니다','게시판내용3입니다','paik',1);
insert into notice (seq,title,content,nickname,visited) value(4,'게시판제목4입니다','게시판내용4입니다','son',2);
select * from notice
commit;


create table databank(seq int not null auto_increment,
title varchar(200) not null,
fileurl varchar(300)not null,
author varchar(300),
primary key(seq));


