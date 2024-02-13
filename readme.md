# Sessió 1

Crear un xat de comunicació simple entre 2 processos (classes).

- [Detall](#Detall)
- [Ampliacions](#ampliacio)

## Detall

La primer classe a implementar és **HelloWorldClient**.
Aquesta s’ha d’encarregar de:
- Obrir una connexió contra una IP/port
- Enviar un enter
- Tancar la connexió

La segona classe és **HelloWorldServer**.
Aquesta s’ha d’encarregar de:
- Obrir una connexió en mode lectura per un port determinat (1234 per exemple)
- Llegir un enter.
- Pintar-lo per pantalla.
- Tancar la connexió apropiadament

Assegura’t de controlar els errors tant en el client com en el server (try-catch)

## Ampliacions

- Fes que el client pugui rebre l’adreça ip on es connecta via el primer paràmetre de la crida
- Envia un double després de l’enter (i llegeix-lo i printa’l des del server)
- Prova d’enviar / rebre l’enter amb el mètode readInt o llegint 4 bytes amb el mètode readByte
- Envia un booleà després (i llegeix-lo i printa’l des del server)
- Envia un string després (i llegeix-lo i printa’l des del server amb readUTF())
- Prova de llegir l’string amb els mètodes readShort() per saber-ne la longitud en bytes i un bucle de readByte() per llegir els caràcters
