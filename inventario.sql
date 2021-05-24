--
-- PostgreSQL database dump
--

-- Dumped from database version 11.11
-- Dumped by pg_dump version 11.11

-- Started on 2021-05-24 02:29:38

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 198 (class 1259 OID 32813)
-- Name: cargos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cargos (
    id_cargo integer NOT NULL,
    nombre_cargo character varying(30) NOT NULL
);


ALTER TABLE public.cargos OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 32806)
-- Name: mercancias; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.mercancias (
    id_mercancia integer NOT NULL,
    id_usuario integer NOT NULL,
    nombre_producto character varying(255) NOT NULL,
    cantidad integer,
    fecha_ingreso date NOT NULL
);


ALTER TABLE public.mercancias OWNER TO postgres;

--
-- TOC entry 196 (class 1259 OID 32801)
-- Name: usuarios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuarios (
    id_usuario integer NOT NULL,
    id_cargo integer NOT NULL,
    nombre_usuario character varying(60) NOT NULL,
    edad integer NOT NULL,
    "fecha_ingreso_compañia" date NOT NULL
);


ALTER TABLE public.usuarios OWNER TO postgres;

--
-- TOC entry 2824 (class 0 OID 32813)
-- Dependencies: 198
-- Data for Name: cargos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cargos (id_cargo, nombre_cargo) FROM stdin;
1	Asesor de ventas
2	administrador
3	soporte
\.


--
-- TOC entry 2823 (class 0 OID 32806)
-- Dependencies: 197
-- Data for Name: mercancias; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.mercancias (id_mercancia, id_usuario, nombre_producto, cantidad, fecha_ingreso) FROM stdin;
1	1	Carros	27	2021-05-23
2	1	motos	10	2021-05-23
\.


--
-- TOC entry 2822 (class 0 OID 32801)
-- Dependencies: 196
-- Data for Name: usuarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.usuarios (id_usuario, id_cargo, nombre_usuario, edad, "fecha_ingreso_compañia") FROM stdin;
1	2	William bueno	27	2012-05-23
2	3	Jesus Antonio	26	2012-05-23
\.


--
-- TOC entry 2698 (class 2606 OID 32817)
-- Name: cargos cargos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cargos
    ADD CONSTRAINT cargos_pkey PRIMARY KEY (id_cargo);


--
-- TOC entry 2694 (class 2606 OID 32812)
-- Name: mercancias mercancias_nombre_producto_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.mercancias
    ADD CONSTRAINT mercancias_nombre_producto_key UNIQUE (nombre_producto);


--
-- TOC entry 2696 (class 2606 OID 32810)
-- Name: mercancias mercancias_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.mercancias
    ADD CONSTRAINT mercancias_pkey PRIMARY KEY (id_mercancia);


--
-- TOC entry 2692 (class 2606 OID 32805)
-- Name: usuarios usuarios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (id_usuario);


--
-- TOC entry 2700 (class 2606 OID 32823)
-- Name: mercancias fkmercancias462588; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.mercancias
    ADD CONSTRAINT fkmercancias462588 FOREIGN KEY (id_usuario) REFERENCES public.usuarios(id_usuario);


--
-- TOC entry 2699 (class 2606 OID 32818)
-- Name: usuarios fkusuarios508635; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT fkusuarios508635 FOREIGN KEY (id_cargo) REFERENCES public.cargos(id_cargo);


-- Completed on 2021-05-24 02:29:39

--
-- PostgreSQL database dump complete
--

