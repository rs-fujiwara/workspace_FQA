-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: fqa
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(20) DEFAULT NULL,
  `admin_pwd` varchar(20) DEFAULT NULL,
  `admin_email` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'root','root','1324688478@gmail.com');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `child_category`
--

DROP TABLE IF EXISTS `child_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `child_category` (
  `child_category_id` int(11) NOT NULL AUTO_INCREMENT,
  `child_category_name` varchar(100) DEFAULT NULL,
  `parent_category_id` int(11) NOT NULL,
  PRIMARY KEY (`child_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `child_category`
--

LOCK TABLES `child_category` WRITE;
/*!40000 ALTER TABLE `child_category` DISABLE KEYS */;
INSERT INTO `child_category` VALUES (1,'料金',1),(2,'ご購入方法',1),(3,'サービス',1),(4,'製品・お客様サポート',1),(5,'WiFiルータ',2),(6,'OSバージョンアップ',3),(7,'Android OSその他',3);
/*!40000 ALTER TABLE `child_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contents`
--

DROP TABLE IF EXISTS `contents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contents` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `fqa_question` varchar(200) DEFAULT NULL,
  `fqa_content` text,
  `parent_category` int(11) DEFAULT NULL,
  `child_category` int(11) DEFAULT NULL,
  PRIMARY KEY (`cid`),
  KEY `parent_category` (`parent_category`),
  CONSTRAINT `parent_category` FOREIGN KEY (`parent_category`) REFERENCES `parent_category` (`parent_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contents`
--

LOCK TABLES `contents` WRITE;
/*!40000 ALTER TABLE `contents` DISABLE KEYS */;
INSERT INTO `contents` VALUES (1,'ビジュアルボイスメール(iPhone)について教えてください。','留守番電話サービスでお預かりした伝言メッセージが、ご利用のiPhoneに自動でダウンロードされ、好きな順番で再生できる機能です。',1,1),(2,'iPhoneやiPadは、SIMロック解除できますか?','SIMロック解除できます。 なお、対応機種や受付条件など、詳しくはSIMロック解除をご確認ください。',1,4),(3,'iPhoneとApple Watchのペアリングの設定方法を教えてください。','設定方法は以下のとおりです。\r\n\r\n■事前準備\r\n・Apple Watch Series 3の場合はiOS11以降、Apple Watch Series 4の場合はiOS12以降を搭載した、iPhone 6、iPhone 6 Plus(iPhone SE含む)以降のiPhoneを準備してください。\r\n・iPhoneのBluetoothがオンになっていることを確認してください。\r\n・iPhoneがWi-FiまたはLTE/3Gネットワークに接続されていることを確認してください。\r\n\r\n■手順\r\n1.Apple Watchの電源を入れます\r\n2.iPhoneでApple Watch Appを開き、iPhone・Apple Watchそれぞれで「ペアリングを開始」を押します\r\n3.表示される手順に沿って設定を進めます\r\n\r\n※iPhoneとApple Watchを同期している間は、常に近づけておいてください。\r\n\r\n\r\n詳しくは、こちらをご覧ください。\r\niPhoneとApple Watch(GPS + Cellular)のペアリング',1,3),(4,'ビジュアルボイスメール(iPhone)について教えてください。','留守番電話サービスでお預かりした伝言メッセージが、ご利用のiPhoneに自動でダウンロードされ、好きな順番で再生できる機能です。',1,1),(5,'iPhoneやiPadは、SIMロック解除できますか?','SIMロック解除できます。 なお、対応機種や受付条件など、詳しくはSIMロック解除をご確認ください。',1,4),(6,'iPhoneとApple Watchのペアリングの設定方法を教えてください。','設定方法は以下のとおりです。\r\n\r\n■事前準備\r\n・Apple Watch Series 3の場合はiOS11以降、Apple Watch Series 4の場合はiOS12以降を搭載した、iPhone 6、iPhone 6 Plus(iPhone SE含む)以降のiPhoneを準備してください。\r\n・iPhoneのBluetoothがオンになっていることを確認してください。\r\n・iPhoneがWi-FiまたはLTE/3Gネットワークに接続されていることを確認してください。\r\n\r\n■手順\r\n1.Apple Watchの電源を入れます\r\n2.iPhoneでApple Watch Appを開き、iPhone・Apple Watchそれぞれで「ペアリングを開始」を押します\r\n3.表示される手順に沿って設定を進めます\r\n\r\n※iPhoneとApple Watchを同期している間は、常に近づけておいてください。\r\n\r\n\r\n詳しくは、こちらをご覧ください。\r\niPhoneとApple Watch(GPS + Cellular)のペアリング',1,3),(7,'OSバージョンアップを実施しなくても、問題ありませんか?','お客様により快適に携帯電話をご利用いただくため、発売後の商品の機能追加、操作性向上、品質改善、セキュリティパッチの最新化などを目的にバージョンアップを実施しております。',3,1),(8,'【Wi-Fi STATION SH-52A】 特長を教えてください。','主な特長は以下のとおりです。\r\n\r\n・受信時最大4.1Gbps/送信時最大480Mbps対応(※1)\r\n・最新無線LAN規格Wi-Fi6に対応\r\n・有線でも高速通信で、2.5GBASE-T内蔵\r\n※1:端末の仕様であり、発売時点でドコモの通信回線が対応しているのは受信時最大3.4Gbps/送信時最大182Mbpsとなります。なお、2020年夏以降、受信時最大4.1Gbps/送信時最大480Mbpsに対応予定です。',2,1),(9,'携帯電話の製造番号(IMEI)の確認方法を教えてください。','確認方法は以下のとおりです。\r\n\r\n■携帯電話の画面で確認する場合\r\n携帯電話の電話番号入力画面で「*#06#」と入力すると画面に表示されます。\r\n\r\n※一部機種では表示されない場合があります。\r\n※一部機種にて「/」「-」などの記号が表示されます。その場合は、各記号を除いた15桁の数字となります。',4,NULL),(10,'OSバージョンアップを実施しなくても、問題ありませんか?','お客様により快適に携帯電話をご利用いただくため、発売後の商品の機能追加、操作性向上、品質改善、セキュリティパッチの最新化などを目的にバージョンアップを実施しております。',3,1),(11,'【Wi-Fi STATION SH-52A】 特長を教えてください。','主な特長は以下のとおりです。\r\n\r\n・受信時最大4.1Gbps/送信時最大480Mbps対応(※1)\r\n・最新無線LAN規格Wi-Fi6に対応\r\n・有線でも高速通信で、2.5GBASE-T内蔵\r\n※1:端末の仕様であり、発売時点でドコモの通信回線が対応しているのは受信時最大3.4Gbps/送信時最大182Mbpsとなります。なお、2020年夏以降、受信時最大4.1Gbps/送信時最大480Mbpsに対応予定です。',2,1),(12,'携帯電話の製造番号(IMEI)の確認方法を教えてください。','確認方法は以下のとおりです。\r\n\r\n■携帯電話の画面で確認する場合\r\n携帯電話の電話番号入力画面で「*#06#」と入力すると画面に表示されます。\r\n\r\n※一部機種では表示されない場合があります。\r\n※一部機種にて「/」「-」などの記号が表示されます。その場合は、各記号を除いた15桁の数字となります。',4,NULL),(13,'ビジュアルボイスメール(iPhone)について教えてください。','留守番電話サービスでお預かりした伝言メッセージが、ご利用のiPhoneに自動でダウンロードされ、好きな順番で再生できる機能です。',1,1),(14,'iPhoneやiPadは、SIMロック解除できますか?','SIMロック解除できます。 なお、対応機種や受付条件など、詳しくはSIMロック解除をご確認ください。',1,4),(15,'iPhoneとApple Watchのペアリングの設定方法を教えてください。','設定方法は以下のとおりです。\r\n\r\n■事前準備\r\n・Apple Watch Series 3の場合はiOS11以降、Apple Watch Series 4の場合はiOS12以降を搭載した、iPhone 6、iPhone 6 Plus(iPhone SE含む)以降のiPhoneを準備してください。\r\n・iPhoneのBluetoothがオンになっていることを確認してください。\r\n・iPhoneがWi-FiまたはLTE/3Gネットワークに接続されていることを確認してください。\r\n\r\n■手順\r\n1.Apple Watchの電源を入れます\r\n2.iPhoneでApple Watch Appを開き、iPhone・Apple Watchそれぞれで「ペアリングを開始」を押します\r\n3.表示される手順に沿って設定を進めます\r\n\r\n※iPhoneとApple Watchを同期している間は、常に近づけておいてください。\r\n\r\n\r\n詳しくは、こちらをご覧ください。\r\niPhoneとApple Watch(GPS + Cellular)のペアリング',1,3),(16,'OSバージョンアップを実施しなくても、問題ありませんか?','お客様により快適に携帯電話をご利用いただくため、発売後の商品の機能追加、操作性向上、品質改善、セキュリティパッチの最新化などを目的にバージョンアップを実施しております。',3,1),(17,'【Wi-Fi STATION SH-52A】 特長を教えてください。','主な特長は以下のとおりです。\r\n\r\n・受信時最大4.1Gbps/送信時最大480Mbps対応(※1)\r\n・最新無線LAN規格Wi-Fi6に対応\r\n・有線でも高速通信で、2.5GBASE-T内蔵\r\n※1:端末の仕様であり、発売時点でドコモの通信回線が対応しているのは受信時最大3.4Gbps/送信時最大182Mbpsとなります。なお、2020年夏以降、受信時最大4.1Gbps/送信時最大480Mbpsに対応予定です。',2,1),(18,'携帯電話の製造番号(IMEI)の確認方法を教えてください。','確認方法は以下のとおりです。\r\n\r\n■携帯電話の画面で確認する場合\r\n携帯電話の電話番号入力画面で「*#06#」と入力すると画面に表示されます。\r\n\r\n※一部機種では表示されない場合があります。\r\n※一部機種にて「/」「-」などの記号が表示されます。その場合は、各記号を除いた15桁の数字となります。',4,NULL),(19,'OSバージョンアップを実施しなくても、問題ありませんか?','お客様により快適に携帯電話をご利用いただくため、発売後の商品の機能追加、操作性向上、品質改善、セキュリティパッチの最新化などを目的にバージョンアップを実施しております。',3,1),(20,'【Wi-Fi STATION SH-52A】 特長を教えてください。','主な特長は以下のとおりです。\r\n\r\n・受信時最大4.1Gbps/送信時最大480Mbps対応(※1)\r\n・最新無線LAN規格Wi-Fi6に対応\r\n・有線でも高速通信で、2.5GBASE-T内蔵\r\n※1:端末の仕様であり、発売時点でドコモの通信回線が対応しているのは受信時最大3.4Gbps/送信時最大182Mbpsとなります。なお、2020年夏以降、受信時最大4.1Gbps/送信時最大480Mbpsに対応予定です。',2,1),(21,'携帯電話の製造番号(IMEI)の確認方法を教えてください。','確認方法は以下のとおりです。\r\n\r\n■携帯電話の画面で確認する場合\r\n携帯電話の電話番号入力画面で「*#06#」と入力すると画面に表示されます。\r\n\r\n※一部機種では表示されない場合があります。\r\n※一部機種にて「/」「-」などの記号が表示されます。その場合は、各記号を除いた15桁の数字となります。',4,NULL),(24,'ビジュアルボイスメール(iPhone)について教えてください。','留守番電話サービスでお預かりした伝言メッセージが、ご利用のiPhoneに自動でダウンロードされ、好きな順番で再生できる機能です。',1,1),(25,'iPhoneやiPadは、SIMロック解除できますか?','SIMロック解除できます。 なお、対応機種や受付条件など、詳しくはSIMロック解除をご確認ください。',1,4),(26,'iPhoneとApple Watchのペアリングの設定方法を教えてください。','設定方法は以下のとおりです。\r\n\r\n■事前準備\r\n・Apple Watch Series 3の場合はiOS11以降、Apple Watch Series 4の場合はiOS12以降を搭載した、iPhone 6、iPhone 6 Plus(iPhone SE含む)以降のiPhoneを準備してください。\r\n・iPhoneのBluetoothがオンになっていることを確認してください。\r\n・iPhoneがWi-FiまたはLTE/3Gネットワークに接続されていることを確認してください。\r\n\r\n■手順\r\n1.Apple Watchの電源を入れます\r\n2.iPhoneでApple Watch Appを開き、iPhone・Apple Watchそれぞれで「ペアリングを開始」を押します\r\n3.表示される手順に沿って設定を進めます\r\n\r\n※iPhoneとApple Watchを同期している間は、常に近づけておいてください。\r\n\r\n\r\n詳しくは、こちらをご覧ください。\r\niPhoneとApple Watch(GPS + Cellular)のペアリング',1,3);
/*!40000 ALTER TABLE `contents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parent_category`
--

DROP TABLE IF EXISTS `parent_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `parent_category` (
  `parent_category_id` int(11) NOT NULL,
  `parent_category_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`parent_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parent_category`
--

LOCK TABLES `parent_category` WRITE;
/*!40000 ALTER TABLE `parent_category` DISABLE KEYS */;
INSERT INTO `parent_category` VALUES (1,'iPhone・iPad'),(2,'データ通信'),(3,'Android OS共通'),(4,'その他');
/*!40000 ALTER TABLE `parent_category` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-18  1:10:01
