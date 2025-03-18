-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1:3307
-- Thời gian đã tạo: Th3 18, 2025 lúc 04:33 PM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlishop2`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `account`
--

CREATE TABLE `account` (
  `userName` varchar(50) NOT NULL,
  `fullName` varchar(50) DEFAULT NULL,
  `password` varchar(60) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `account`
--

INSERT INTO `account` (`userName`, `fullName`, `password`, `role`, `status`, `email`) VALUES
('admin', 'Admin', '$2a$12$Y87zSnx.tpFvieylSeXuo.agjb7swi3UVnoo6KVMY9xP5STj4zJhm', 'Admin', 1, 'truongs@gmail.com'),
('bobo', 'Đàm  Văn Nguyen', '$2a$12$PhiTGBbHjHoB3dbS6BmCC.rzdMCBqDrdK9Y8Ae8GDUKe1RpHiWARO', 'Quản lý kho', 1, 'nguyendam@gmail.com'),
('sinhsinh1122', 'Bui nhu quynh', '$2a$12$89As1J0AB0yrqGjnQUHtpevc6voGyvzAd8OvzkS1vGDo3YPO2P.Ia', 'Nhân viên nhập', 1, 'quynhbui@gmail.com'),
('thienan', 'Nguyễn Thiên Ân', '$2a$12$myOaq0kATMzNkbxgzQEkPu8ht2K0pXOGzZMZo6nSBowq6EyoLo7tS', 'Nhân viên nhập', 1, 'a11611112003@gmail.com'),
('truongsonkmhd', 'truongsoson', '$2a$12$8x2fKTw8dmrH1EYta1AGd.a9n5EZkzo6iJUwaGTlgFT.GZB.vzCSi', 'Admin', 1, 'truongsonkmhd@gmail.com');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `maPhieu` varchar(50) NOT NULL,
  `maSp` varchar(50) NOT NULL,
  `soLuong` int(11) DEFAULT NULL,
  `donGia` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietphieunhap`
--

INSERT INTO `chitietphieunhap` (`maPhieu`, `maSp`, `soLuong`, `donGia`) VALUES
('PN10', 'TA7', 1, 54543),
('PN10', 'TA8', 99, 543543),
('PN2', 'TA6', 34, 5433549888),
('PN3', 'TA2', 33, 33),
('PN4', 'TA2', 88, 33),
('PN5', 'DU1', 1, 4324),
('PN5', 'TA6', 1, 5433549888),
('PN5', 'TA7', 1, 54543),
('PN5', 'TA8', 1, 543543),
('PN6', 'TA2', 88, 33),
('PN7', 'DU2', 1, 432),
('PN8', 'TA7', 1, 54543),
('PN9', 'DU2', 56, 432);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietphieuxuat`
--

CREATE TABLE `chitietphieuxuat` (
  `maPhieu` varchar(50) NOT NULL,
  `maSp` varchar(50) NOT NULL,
  `soLuong` int(11) DEFAULT NULL,
  `donGia` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietphieuxuat`
--

INSERT INTO `chitietphieuxuat` (`maPhieu`, `maSp`, `soLuong`, `donGia`) VALUES
('PX30', 'TA6', 77, 5433549888),
('PX31', 'TA8', 1, 543543),
('PX31', 'TA9', 22, 432432),
('PX4', 'TA9', 5, 432432),
('PX5', 'TA2', 54, 33),
('PX6', 'TA2', 100, 33),
('PX7', 'TA9', 1, 432432),
('PX8', 'DU2', 100, 432);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khuvuckho`
--

CREATE TABLE `khuvuckho` (
  `maKhuVuc` int(11) NOT NULL,
  `tenKhuVuc` varchar(100) DEFAULT NULL,
  `trangThai` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `khuvuckho`
--

INSERT INTO `khuvuckho` (`maKhuVuc`, `tenKhuVuc`, `trangThai`) VALUES
(1, 'Khu vuc A', 1),
(2, 'Khu vuc B', 1),
(3, 'Khu vuc C', 0),
(4, 'Khu Vuc kho D', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `maNhaCungCap` varchar(50) NOT NULL,
  `tenNhaCungCap` varchar(50) DEFAULT NULL,
  `Sdt` varchar(50) DEFAULT NULL,
  `diaChi` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhacungcap`
--

INSERT INTO `nhacungcap` (`maNhaCungCap`, `tenNhaCungCap`, `Sdt`, `diaChi`) VALUES
('CODO', 'CTY ăn cùng bà tuyết', '02838115345', 'hà nội'),
('FPT', 'Công Ty Cổ Phần Bán Lẻ Kỹ Thuật Số FPT', '02873023456', 'Hà nội'),
('gsgdfg', 'gdfgdg', '546546', 'dfgfgdf'),
('Wavez', 'Công Ty TNHH Điều Khiển Tự Động An Phát', '02835109735', 'Hà nội ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieunhap`
--

CREATE TABLE `phieunhap` (
  `maPhieu` varchar(50) NOT NULL,
  `thoiGianTao` timestamp NULL DEFAULT NULL,
  `nguoiTao` varchar(50) DEFAULT NULL,
  `maNhaCungCap` varchar(50) DEFAULT NULL,
  `tongTien` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phieunhap`
--

INSERT INTO `phieunhap` (`maPhieu`, `thoiGianTao`, `nguoiTao`, `maNhaCungCap`, `tongTien`) VALUES
('PN1', '2025-03-18 09:32:30', 'admin', 'CODO', 13084071),
('PN10', '2025-03-18 15:25:50', 'admin', 'CODO', 53865300),
('PN2', '2025-03-18 09:43:39', 'admin', 'CODO', 184740696192),
('PN3', '2025-03-18 09:43:55', 'admin', 'CODO', 1089),
('PN4', '2025-03-18 09:48:28', 'admin', 'CODO', 2904),
('PN5', '2025-03-18 10:33:16', 'admin', 'CODO', 5434152298),
('PN6', '2025-03-18 10:35:03', 'admin', 'CODO', 2904),
('PN7', '2025-03-18 10:35:35', 'admin', 'CODO', 432),
('PN8', '2025-03-18 10:35:51', 'admin', 'CODO', 54543),
('PN9', '2025-03-18 10:36:30', 'admin', 'CODO', 24192);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieuxuat`
--

CREATE TABLE `phieuxuat` (
  `maPhieu` varchar(50) NOT NULL,
  `thoiGianTao` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `nguoiTao` varchar(50) NOT NULL,
  `tongTien` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phieuxuat`
--

INSERT INTO `phieuxuat` (`maPhieu`, `thoiGianTao`, `nguoiTao`, `tongTien`) VALUES
('PX28', '2025-03-16 07:43:52', 'Admin', 57180000),
('PX30', '2025-03-18 09:44:39', 'Admin', 418383341376),
('PX31', '2025-03-18 09:47:11', 'Admin', 10057047),
('PX4', '2025-03-18 10:10:30', 'Admin', 2162160),
('PX5', '2025-03-18 10:34:03', 'Admin', 1782),
('PX6', '2025-03-18 10:35:23', 'Admin', 3300),
('PX7', '2025-03-18 10:36:04', 'Admin', 432432),
('PX8', '2025-03-18 10:36:47', 'Admin', 43200);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `maSp` varchar(50) NOT NULL,
  `tenSp` varchar(100) DEFAULT NULL,
  `soLuong` int(11) NOT NULL DEFAULT 0,
  `gia` double NOT NULL DEFAULT 0,
  `thuongHieu` varchar(50) DEFAULT NULL,
  `khuVucKho` int(11) DEFAULT NULL,
  `xuatXu` varchar(50) DEFAULT NULL,
  `loaiSp` varchar(50) DEFAULT NULL,
  `trangthai` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`maSp`, `tenSp`, `soLuong`, `gia`, `thuongHieu`, `khuVucKho`, `xuatXu`, `loaiSp`, `trangthai`) VALUES
('DU1', 'fdasdfsa', 1, 4324, 'dfsfsdffds', 1, 'fsdf', 'Nuoc Uong', 1),
('DU2', 'fdfs', 12, 432, 'fsds', 3, 'fsdf', 'Nuoc Uong', 1),
('TA1', 'sp1', 32, 12000, 'tq', 1, 'rwerw', '3r2rwe', 0),
('TA2', 'fdasf', 88, 33, 'àds', 3, 'fa', 'Nuoc Uong', 1),
('TA3', 'trsdfgg', 33, 543543, 'sgfd', 3, 'gsr', 'Nuoc Uong', 0),
('TA4', 'fdgs', 0, 543, 'gsdf', 3, 'sgdfdg', 'Nuoc Uong', 0),
('TA5', 'ff', 0, 432, 'fdssdf', 3, 'rưefds', 'Nuoc Uong', 0),
('TA6', 'fds', 1, 5433549888, 'gsfdgfdsfsdf', 2, 'sgfg', 'Nuoc Uong', 1),
('TA7', 'rfadfas', 3, 54543, 'gsdfgs', 1, 'gfdsg', 'Thuc An', 1),
('TA8', 'sfgdgf', 100, 543543, 'segrgser', 1, 'gsdg', 'Thuc An', 1),
('TA9', 'gfgdsfg', 1, 432432, 'fdssgf', 1, 'fsdfsd', 'Thuc An', 1);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`userName`);

--
-- Chỉ mục cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD PRIMARY KEY (`maPhieu`,`maSp`),
  ADD KEY `maSp` (`maSp`);

--
-- Chỉ mục cho bảng `chitietphieuxuat`
--
ALTER TABLE `chitietphieuxuat`
  ADD PRIMARY KEY (`maPhieu`,`maSp`),
  ADD KEY `maSp` (`maSp`);

--
-- Chỉ mục cho bảng `khuvuckho`
--
ALTER TABLE `khuvuckho`
  ADD PRIMARY KEY (`maKhuVuc`);

--
-- Chỉ mục cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`maNhaCungCap`);

--
-- Chỉ mục cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`maPhieu`),
  ADD KEY `nguoiTao` (`nguoiTao`),
  ADD KEY `maNhaCungCap` (`maNhaCungCap`);

--
-- Chỉ mục cho bảng `phieuxuat`
--
ALTER TABLE `phieuxuat`
  ADD PRIMARY KEY (`maPhieu`),
  ADD KEY `nguoiTao` (`nguoiTao`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`maSp`),
  ADD KEY `khuVucKho` (`khuVucKho`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD CONSTRAINT `chitietphieunhap_ibfk_1` FOREIGN KEY (`maPhieu`) REFERENCES `phieunhap` (`maPhieu`) ON DELETE CASCADE,
  ADD CONSTRAINT `chitietphieunhap_ibfk_2` FOREIGN KEY (`maSp`) REFERENCES `sanpham` (`maSp`) ON DELETE CASCADE;

--
-- Các ràng buộc cho bảng `chitietphieuxuat`
--
ALTER TABLE `chitietphieuxuat`
  ADD CONSTRAINT `chitietphieuxuat_ibfk_1` FOREIGN KEY (`maPhieu`) REFERENCES `phieuxuat` (`maPhieu`) ON DELETE CASCADE,
  ADD CONSTRAINT `chitietphieuxuat_ibfk_2` FOREIGN KEY (`maSp`) REFERENCES `sanpham` (`maSp`) ON DELETE CASCADE;

--
-- Các ràng buộc cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_ibfk_1` FOREIGN KEY (`nguoiTao`) REFERENCES `account` (`userName`) ON DELETE SET NULL,
  ADD CONSTRAINT `phieunhap_ibfk_2` FOREIGN KEY (`maNhaCungCap`) REFERENCES `nhacungcap` (`maNhaCungCap`) ON DELETE SET NULL;

--
-- Các ràng buộc cho bảng `phieuxuat`
--
ALTER TABLE `phieuxuat`
  ADD CONSTRAINT `phieuxuat_ibfk_1` FOREIGN KEY (`nguoiTao`) REFERENCES `account` (`userName`) ON DELETE CASCADE;

--
-- Các ràng buộc cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `sanpham_ibfk_1` FOREIGN KEY (`khuVucKho`) REFERENCES `khuvuckho` (`maKhuVuc`) ON DELETE SET NULL;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
