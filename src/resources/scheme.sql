--  Author:  sammidev
--  Created: Jan 13, 2021
--  MySQL


create database jadwal_kuliah;
use jadwal_kuliah;

CREATE table admin(
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
);

INSERT INTO admin (username,password) VALUES ('admin','admin');
INSERT INTO admin (username,password) VALUES ('sammidev','sammidev');

CREATE table tb_jadwal_kuliah  (
  id INT AUTO_INCREMENT PRIMARY KEY,
  mata_kuliah VARCHAR(50) NOT NULL, 
  nama_dosen VARCHAR(50) NOT NULL, 
  hari VARCHAR(7) NOT NULL,
  waktu_mulai TIME,
  waktu_selesai TIME
);

INSERT INTO `tb_jadwal_kuliah`(`mata_kuliah`, `nama_dosen`, `hari`, `waktu_mulai`, `waktu_selesai`) VALUES ('mtk','sukamto','senin','08:00:00','10:00:00');
INSERT INTO `tb_jadwal_kuliah`(`mata_kuliah`, `nama_dosen`, `hari`, `waktu_mulai`, `waktu_selesai`) VALUES ('pemrograman','aminuddin','selasa','08:00:00','10:00:00');