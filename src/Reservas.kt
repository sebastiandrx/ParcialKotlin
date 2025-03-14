class Reservas (
    val id: Int,
    val id_huesped: String,
    val nombre_huesped: String,
    val email_huesped: String,
    val numero_habitacion: Int,
    val tipo_habitacion: String,
    val precio_noche: Double,
    val cantidad_nochesreservadas: Int
) {
    fun calcularCostoTotal(): Double{
        return precio_noche * cantidad_nochesreservadas
    }

    override fun toString(): String {
        return """
            Id_Reserva: $id
            Id_Huesped: $id_huesped
            Emai: $email_huesped
            Habitacion: $numero_habitacion - Tipo $tipo_habitacion
            Precio por noche: $precio_noche
            Noches Reservadas: $cantidad_nochesreservadas
            Monto total: ${calcularCostoTotal()}
            """.trimIndent()
    }
}
