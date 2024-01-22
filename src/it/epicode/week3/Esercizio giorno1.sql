Select * from public.clienti where nome ='Mario';

Select * from public.clienti where "annoNascita" = 1982;

Select * from public.fatture where "Iva" = 20;

Select * from public.prodotti where extract(year from "DataAttivazione") = 2017;

Select * from public.fatture f join public.clienti c on f."IdCliente" = c."numeroCliente" where f."Importo" < 1000;

Select f."NumeroFattura", f."Importo", f."Iva", f."DataFattura", fo."Denominazione" from public.fatture f
join fornitori fo on f."NumeroFornitore" = fo."NumeroFornitore";

Select extract(year from f."DataFattura") AS Anno, COUNT(*) AS "NumeroFatture"
from public.fatture f
where f."Iva" = 20
group by Anno;

SELECT EXTRACT(YEAR FROM "DataFattura") AS Anno, COUNT(*) AS "NumeroFatture", SUM("Importo") AS SommaImporti
FROM public.fatture
GROUP BY Anno;

SELECT EXTRACT(YEAR FROM "DataFattura") AS Anno, COUNT(*) AS "NumeroFatture"
FROM public.fatture
WHERE "Tipologia" = 'A'
GROUP BY Anno
HAVING COUNT(*) >= 2;

SELECT c."regioneResidenza", SUM(f."Importo") AS TotaleImporti
FROM public.fatture f
JOIN public.clienti c ON f."IdCliente" = c."numeroCliente"
GROUP BY c."regioneResidenza";

SELECT COUNT(DISTINCT c."numeroCliente") AS NumeroClienti
FROM public.clienti c
JOIN public.fatture f ON c."numeroCliente" = f."IdCliente"
WHERE c."annoNascita" = 1980 AND f."Importo" > 50;


