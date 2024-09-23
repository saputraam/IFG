def povmbrs = operation.grid.pov
def strYear = (povmbrs.find {it.dimName =='Years'}.essbaseMbrName).toString()

String calcScript = """

FIX(
${cscParams(operation.grid.pov)},
"Jan":"Dec",
"Direct Input"
);
    "% Beban Umum dan Administrasi / Premi Bruto"
    ("% Beban Umum dan Administrasi / Premi Bruto" = "Beban Umum dan Administrasi" / "Pendapatan premi asuransi bruto" -> "LOB Aspen" ;)

ENDFIX;


"""
println("The following calc script was executed by $operation.user.fullName: \n $calcScript")
return calcScript.toString()

