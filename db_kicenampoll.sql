-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 26 Jan 2021 pada 16.14
-- Versi server: 10.4.13-MariaDB
-- Versi PHP: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_kicenampoll`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `customer`
--

CREATE TABLE `customer` (
  `Id_customer` int(11) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `Nomor_tlpn` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `customer`
--

INSERT INTO `customer` (`Id_customer`, `Nama`, `Alamat`, `Nomor_tlpn`) VALUES
(1, 'Joko', 'Jl.Kopi', '081212123400');

-- --------------------------------------------------------

--
-- Struktur dari tabel `dessertbox`
--

CREATE TABLE `dessertbox` (
  `kode_variant` varchar(5) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `size` varchar(10) NOT NULL,
  `Harga` decimal(15,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `dessertbox`
--

INSERT INTO `dessertbox` (`kode_variant`, `nama`, `size`, `Harga`) VALUES
('CDSM1', 'Cadbury Delight', 'Medium', '45000.00'),
('CDSS1', 'Cadbury Delight', 'Small', '15000.00'),
('RVSM2', 'Red Velvet', 'Medium', '36000.00'),
('RVSS2', 'Red Velvet', 'Small', '12000.00'),
('TMSM3', 'Tiramisu', 'Medium', '39000.00'),
('TMSS3', 'Tiramisu', 'Small', '13000.00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pesanan`
--

CREATE TABLE `pesanan` (
  `Id_pesanan` int(11) NOT NULL,
  `Jumlah_pesanan` int(11) NOT NULL,
  `Total` decimal(15,2) NOT NULL,
  `Tgl_pesan` date NOT NULL,
  `Id_customer` int(11) NOT NULL,
  `username` varchar(15) NOT NULL,
  `kode_variant` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pesanan`
--

INSERT INTO `pesanan` (`Id_pesanan`, `Jumlah_pesanan`, `Total`, `Tgl_pesan`, `Id_customer`, `username`, `kode_variant`) VALUES
(1, 1, '45000.00', '2021-01-20', 1, 'finkamarisa', 'CDSM1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `username` varchar(15) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('finkamarisa', '11112222');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Id_customer`);

--
-- Indeks untuk tabel `dessertbox`
--
ALTER TABLE `dessertbox`
  ADD PRIMARY KEY (`kode_variant`);

--
-- Indeks untuk tabel `pesanan`
--
ALTER TABLE `pesanan`
  ADD PRIMARY KEY (`Id_pesanan`),
  ADD KEY `Id_customer` (`Id_customer`),
  ADD KEY `username` (`username`),
  ADD KEY `Kode_variant` (`kode_variant`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `customer`
--
ALTER TABLE `customer`
  MODIFY `Id_customer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `pesanan`
--
ALTER TABLE `pesanan`
  MODIFY `Id_pesanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `pesanan`
--
ALTER TABLE `pesanan`
  ADD CONSTRAINT `pesanan_ibfk_1` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pesanan_ibfk_2` FOREIGN KEY (`Id_customer`) REFERENCES `customer` (`Id_customer`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pesanan_ibfk_3` FOREIGN KEY (`kode_variant`) REFERENCES `dessertbox` (`kode_variant`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
