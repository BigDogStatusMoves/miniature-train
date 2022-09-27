
fun main() {
    val emp1 = Employee("Jane Doe", PositionTitle.ADMINISTRATION, true, 27.00, 1)
    val emp2 = Employee("Larry Jackson", PositionTitle.PRODUCTION, false, 22.00, 2)
    val emp3 = Employee("John Smith", PositionTitle.MAINTENANCE, false, 21.00, 3)
    emp1.calculate(45.0)
    emp1.display()
    emp2.calculate(50.0)
    emp2.display()
    emp3.calculate(35.0)
    emp3.display()
}


