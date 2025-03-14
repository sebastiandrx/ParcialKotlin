fun main() {
    val sistema = SistemaR()

    var opcion = 0

    while (opcion != 4) {
        mostrarMenu()
        try {
            print("Ingresa tu opción: ")
            opcion = readLine()?.toIntOrNull() ?: 0

            when (opcion) {
                1 -> registrarNuevaReserva(sistema)
                2 -> cancelarReservaExistente(sistema)
                3 -> sistema.mostrar_ReservasActivas()
                4 -> println("Saliendo del sistema...")
                else -> println("Opción invalida. Intenta de nuevo")
            }
        } catch (e: Exception) {
            println("Entrada invalida. Por favor ingresa un numero")
        }
        println()
    }
}

        fun mostrarMenu() {
            println("SISTEMA DE RESERVAS DE HOTEL")
            println("1. Registrar nueva reserva")
            println("2. Cancelar reserva existente")
            println("3. Mostrar reservas activas")
            println("4. Salir")
        }

        fun registrarNuevaReserva(sistema: SistemaR) {
            println("REGISTRO DE NUEVA RESERVA")

            print("ID del huésped: ")
            val idHuesped = readLine() ?: ""

            print("Nombre del huésped: ")
            val nombreHuesped = readLine() ?: ""

            print("Email del huésped: ")
            val emailHuesped = readLine() ?: ""

            print("Número de habitación: ")
            val numeroHabitacion = readLine()?.toIntOrNull() ?: 0

            print("Tipo de habitación: ")
            val tipoHabitacion = readLine() ?: ""

            print("Precio por noche: ")
            val precioPorNoche = readLine()?.toDoubleOrNull() ?: 0.0

            print("Cantidad de noches: ")
            val cantidadNoches = readLine()?.toIntOrNull() ?: 0

            sistema.registrar_Reserva(
                idHuesped,
                nombreHuesped,
                emailHuesped,
                numeroHabitacion,
                tipoHabitacion,
                precioPorNoche,
                cantidadNoches
            )
        }

        fun cancelarReservaExistente(sistema: SistemaR) {
            println("=== CANCELACIÓN DE RESERVA ===")

            print("Ingresa el ID de la reserva a cancelar: ")
            val idReserva = readLine()?.toIntOrNull() ?: 0

            sistema.cancelar_Reserva(idReserva)
        }
