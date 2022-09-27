import java.text.DecimalFormat

class Employee(val name:String, val position: PositionTitle, val salary:Boolean, val payRate:Double, val shift:Int) {
    private val decimalFormat = DecimalFormat("###,###.###")
    var weeklyPay: Double = 0.00
    var formattedPay: String = decimalFormat.format(weeklyPay)
    fun calculate(hoursln: Double) {
        if (hoursln>40 && !salary){
            val overtimeHours = hoursln - 40
            val hoursln = hoursln - overtimeHours
            weeklyPay = when (shift) {
                2 -> ((payRate * hoursln) + ((payRate*overtimeHours)*1.5))+(.05*((payRate * hoursln) + ((payRate*overtimeHours)*1.5)))
                3 -> ((payRate * hoursln) + ((payRate*overtimeHours)*1.5))+(.10*((payRate * hoursln) + ((payRate*overtimeHours)*1.5)))
                else -> ((payRate * hoursln) + ((payRate*overtimeHours)*1.5))
            }
                
        }
        else{
            weeklyPay = when (shift) {
                2 -> (payRate*hoursln) + (.05*(payRate * hoursln))
                3 -> (payRate*hoursln) + (.10*(payRate * hoursln))
                else -> (payRate*hoursln)
            }
            

        }
        formattedPay = decimalFormat.format(weeklyPay)
    }
    fun display() {
        println("Name: $name")
        println("Position: $position")
        println("Pay Rate: $payRate")
        println("Weekly Earnings: $formattedPay\n")

    }

}