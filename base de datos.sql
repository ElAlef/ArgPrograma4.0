CREATE DATABASE SISTEMA_DE_REPORTE_DE_INCIDENTE;
USE SISTEMA_DE_REPORTE_DE_INCIDENTE;

CREATE TABLE Cliente(
id INT PRIMARY KEY NOT NULL auto_increment,
cuit INT(11),
razonSocial VARCHAR(50),
email VARCHAR(50)
);

CREATE TABLE Servicio(
id INT PRIMARY KEY NOT NULL auto_increment,
descripcion VARCHAR(150),
tipo_problema VARCHAR(150),
cliente_id INT 
);

CREATE TABLE Incidente(
id INT PRIMARY KEY NOT NULL auto_increment,
descripción VARCHAR(150),
tipo_Problema VARCHAR(150),
estado ENUM('incompleto', 'en proceso', 'finalizado'),
fecha_Ingreso DATE,
fecha_Resolución_Estimada DATE,
fecha_Resolución_Real DATE,
servicio_id INT,
cliente1_id INT,
tecnico_id INT
);

CREATE TABLE Tecnico(
id INT PRIMARY KEY NOT NULL auto_increment,
Nombre VARCHAR(50),
apellido VARCHAR(50),
email VARCHAR(50),
telefono INT
);

CREATE TABLE Especialidad(
id INT PRIMARY KEY NOT NULL auto_increment,
Nombre VARCHAR(50),
descripcion VARCHAR(150)
);

CREATE TABLE Tecnico_especialidad(
tecnico1_id INT,
especialidad_id INT
);
