class SistemaR {
    private val reservas = mutableListOf<Reservas>()
    private var contadorId = 1

    fun registrar_Reserva(
        id_Huesped: String,
        nombre_Huespued: String,
        email_Huesped: String,
        numero_Habitacion: Int,
        tipo_Habitacion: String,
        precio_Noche:Double,
        cantidad_Noches: Int
    ): Boolean{
        if (reservas.any{it.numero_habitacion == numero_Habitacion}){
            println("La habitación $numero_Habitacion ya está reservada")
            return false
        }

        val nueva_Reserva = Reservas(
            contadorId ++,
            id_Huesped,
            nombre_Huespued,
            email_Huesped,
            numero_Habitacion,
            tipo_Habitacion,
            precio_Noche,
            cantidad_Noches
        )

        reservas.add(nueva_Reserva)
        println("Reserva registrada exitosamente con ID: ${nueva_Reserva.id}")
        return true
    }

    fun cancelar_Reserva(idReserva: Int): Boolean{
        val eliminarReserva = reservas.find{it.id == idReserva}
        if (eliminarReserva !=null){
            reservas.remove(eliminarReserva)
            println("Reserva con ID $idReserva cancelada con exito")
            return true
        }
        println("No se encontró ninguna reserva con ese ID $idReserva")
        return false
    }

    fun mostrar_ReservasActivas(){
        if (reservas.isEmpty()){
            println("No hay reservas activas en el sistema")
            return
        }

        println("RESERVAS ACTIVAS")
        reservas.forEach{reservas ->
            print(reservas)
            println("")
        }
    }

    fun obtener_Reservas_Huesped(id_Huesped: String): List <Reservas>{
        return reservas.filter { it.id_huesped == id_Huesped }
    }
    fun obtenerReservaPorId(idReserva: Int): Reservas? {
        return reservas.find { it.id == idReserva }
    }
}

