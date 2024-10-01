-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: intern_2024
-- ------------------------------------------------------
-- Server version	9.0.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `userid` varchar(255) NOT NULL,
  `user_address` varchar(255) DEFAULT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `userpw` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('23329a23-1f34-44a3-8dcf-1b3bd82f5360','HCM','10239102930','Sunshine','adskaksdj'),('390c58b4-7c51-488f-bd5a-2750c0ba371b','HCM','10239102930',NULL,'adskaksdj'),('453746b2-beb0-45a9-9a65-9f46f4f27e07','Hanoi','088840630112','Sadge2',NULL),('75a0117e-a2c2-4525-a40c-8d1754e0c121','Hanoi','08884061213','Sadg4222111','huy1231233'),('90370819-4414-4835-b14d-ca3b1da63fb8','Hanoi','0888406301','Sadge1',NULL),('94da6db8-0ed3-424e-b0ff-f8d450074b84',NULL,NULL,NULL,NULL),('a5d8de86-9eb5-48e4-a90a-1d2ba4ea7f79','Hanoi','09102390132','jdadj112','1231293918'),('a634b457-8db5-4723-a408-9880f6fa7986','Hanoi','08884061213','Sadg42221','huy1231233'),('a98fa9b7-f1e0-4d48-8059-4f5900a661d0','Hanoi','08884061213','Sa121212dg1311','h331212'),('beab2d26-e9fd-499f-ac56-c34820c11dce','Hanoi','08884061213','Sadg43','huyvu0603');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-01  8:59:46
