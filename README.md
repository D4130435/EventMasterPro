# EventMasterPro
EventMasterPro es una aplicación Java desarrollada para gestionar eventos universitarios en Medellín. Permite crear, modificar, eliminar y visualizar eventos, artistas y reportes financieros relacionados con las festividades de las universidades públicas.

🚀 ¿Cómo usar la aplicación?

  1. Requisitos
    -> JDK 17 o superior
    -> IDE recomendado: NetBeans
    -> Consola para entrada de datos (la aplicación es completamente interactiva por terminal)

  2. Clonar el repositorio
     -> git clone https://github.com/D4130435/EventMasterPro
     -> cd EventMasterPro
     
  3. Compilar y ejecutar (NetBeans)
     -> Importa el proyecto como un proyecto Java.
     -> Asegúrate de que la clase principal sea EventMasterPro.
     -> Ejecuta el programa desde el IDE.

📋 Funcionalidades principales

  1. Crear evento o artista
  2. Modificar evento o artista
  3. Eliminar evento o artista 
  4. Mostrar información:
      -> Evento
      -> Artista
      -> Reportes financieros
      -> Historial de eventos
      
🧠 Notas

  1. Todos los montos deben ingresarse en USD.
  2. La información se gestiona mediante consola/interfaz de texto.
  3. No se utiliza persistencia a archivos o bases de datos reales (HashMaps internos se utilizan para almacenar la información en memoria).

📂 Estructura del proyecto

  com/mycompany/eventmasterpro/
  ├── AbstractEventType.java      // Clase base para eventos
  ├── ArtistEvent.java            // Gestión de artistas
  ├── DataBases.java              // Simulación de base de datos con HashMaps
  ├── EventMasterPro.java         // Clase principal (main)
  ├── EventReport.java            // Reportes de ingresos y egresos
  └── ManagerEvent.java           // Gestión de eventos
      
