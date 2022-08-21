import csv

print("\nTarea: Redes Sociales\t\tArroyo Palacios Diego")

Encabezados = []
Facebook = []
Twitter = []
Youtube = []

# Ubicación del archivo csv
with open("C:/Users/diego/Documents\EDD_1310/Ejercicio_Redes_Sociales/presenciaredes.csv") as csvfile:
    reader = csv.reader(csvfile)
    for row in reader:
        if row[0] == 'FACEBOOK': Facebook.append(row)
        elif row[0] == 'TWITTER': Twitter.append(row)
        elif row[0] == 'YOUTUBE': Youtube.append(row)
        else: Encabezados.append(row)

# Mostrar en pantalla la diferencia de seguidores (followers) en Twitter entre el mes de enero y junio.
enero = Twitter[0][3].replace(',','')
junio = Twitter[0][8].replace(',','')
dif = int(enero) - int(junio)
print(f"\nDiferencia de seguidores en Twitter entre el mes de Enero y Junio: {abs(dif)} seguidores")

# Permita calcular la diferencia de visualizaciones de YouTube entre los meses seleccionados por teclado (enero a junio).
print("\nDiferencia de visualizaciones de YouTube entre los meses de Enero y Junio: \n")
mes1 = input("Ingresa un mes de Enero a Junio: ").upper()
mes2 = input("Ingresa un mes de {} a Junio: ".format(mes1)).upper()
v_mes1 = Youtube[1][Encabezados[0].index(mes1)].replace(',','')
v_mes2 = Youtube[1][Encabezados[0].index(mes2)].replace(',','')
dif = int(v_mes1) - int(v_mes2)
print(f"\nLa diferencia de visualizaciones entre el mes de {mes1} y {mes2} es de: {abs(dif)} visualizaciones")

# Calcular el promedio de crecimiento de Twitter y Facebook entre los meses de enero a junio.
cf = []
ct = []
for i in range(3, len(Facebook[1])-1):
    v = Facebook[1][i].replace(',','')
    cf.append(int(v))
for i in range(3, len(Twitter[1])-1):
    v = Twitter[1][i].replace(',','')
    ct.append(int(v))
promf = sum(cf) / len(cf)
promt = sum(ct) / len(ct)
print(f"\nEl promedio de crecimiento de Twitter de Enero a Junio es de: {round(promt,1)} seguidores\nEl promedio de crecimiento de Facebook de Enero a Junio es de: {round(promf,1)} seguidores\n")