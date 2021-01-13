**`Author:  sammidev`**
**`Created: Jan 13, 2021`**

```sql
create database jadwal_kuliah;
```

**`tb user login`**
```sql
CREATE table admin(
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(10) NOT NULL,
);
```

**`sample user`**
```sql
INSERT INTO admin (username,password) VALUES ('admin','admin');
INSERT INTO admin (username,password) VALUES ('sammidev','sammidev');
```

**`tb jadwal kuliah`**
```sql
CREATE table tb_jadwal_kuliah  (
  id INT AUTO_INCREMENT PRIMARY KEY,
  mata_kuliah VARCHAR(50) NOT NULL, 
  nama_dosen VARCHAR(50) NOT NULL, 
  hari VARCHAR(10) NOT NULL,
  waktu_mulai TIME,
  waktu_selesai TIME
);
```

**`sample jadwal kuliah`**
```sql
INSERT INTO `tb_jadwal_kuliah`(`mata_kuliah`, `nama_dosen`, `hari`, `waktu_mulai`, `waktu_selesai`) 
VALUES ('Matematika Diskrit','Sukamto','Senin','07:30:00','09:00:00');

INSERT INTO `tb_jadwal_kuliah`(`mata_kuliah`, `nama_dosen`, `hari`, `waktu_mulai`, `waktu_selesai`)
 VALUES ('PTSI','Alfirman','Selasa','10:00:00','12:00:00');
```