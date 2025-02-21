-- movie_app.movie_dtls definition

CREATE TABLE `movie_dtls` (
  `movieid` int NOT NULL AUTO_INCREMENT,
  `movieName` varchar(255) DEFAULT NULL,
  `director` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `movieCategory` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `photo` varchar(45) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `year` varchar(255) DEFAULT NULL,
  `video` varchar(255) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `movie_category` varchar(255) DEFAULT NULL,
  `movie_name` varchar(255) DEFAULT NULL,
  `photo_name` varchar(255) DEFAULT NULL,
  `photoName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`movieid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;