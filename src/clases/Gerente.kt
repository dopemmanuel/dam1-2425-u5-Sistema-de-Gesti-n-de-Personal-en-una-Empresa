package com.dam1.eju5.src.clases

class Gerente(
    nombre: String,
    edad: Int,
    salarioBase: Double,
    val bonus: Double,
    val exentoImpuestos: Boolean = false
) : Empleado(nombre, edad, salarioBase, 33.99) {

    override fun calcularSalario(): Double {
        val salarioBaseConImpuestos = if (exentoImpuestos) salarioBase else super.calcularSalario()
        return salarioBaseConImpuestos + bonus
    }

    override fun toString(): String {
        return "${super.toString()}, Bonus: $bonus€, Exento de impuestos: $exentoImpuestos"
    }

    fun administrar(): String {
        return "$nombre está administrando la empresa."
    }
}
