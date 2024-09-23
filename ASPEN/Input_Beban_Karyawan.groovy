def povmbrs = operation.grid.pov
def strYear = (povmbrs.find {it.dimName =='Years'}.essbaseMbrName).toString()

String calcScript = """

FIX(
${cscParams(operation.grid.pov)},
"Jan":"Dec",
"Direct Input"
);

    "Beban gaji direksi dan komisaris" = "Rata-rata Gaji Management" * "MPP Management";
    "Beban gaji karyawan"              = "Rata-rata Gaji Karyawan" * "MPP Karyawan";
    "Beban Manajemen"                  = "Beban gaji direksi dan komisaris" + "Beban tantiem" + "Beban honorarium" + "Beban asuransi purna jabatan" + 
                                         "Beban BPJS manajemen" + "Beban tunjangan manajemen";
    "Beban Karyawan"                   = "Beban gaji karyawan" + "Beban lembur karyawan" + "Beban asuransi kesehatan karyawan"+ "Beban asuransi jiwa karyawan"+ "Beban kesejahteraan karyawan"
                                          +"Beban pengobatan karyawan" + "Beban dana pensiun" + "Beban kompensasi PKWT/PKWTT" + "Beban kompensasi kinerja karyawan" + "Beban imbalan pasca kerja karyawan"
                                          + "Beban BPJS karyawan" + "Beban tunjangan karyawan" + "Beban perekrutan karyawan" + "Beban penugasan karyawan" + "Beban karyawan lainnya";





ENDFIX;


"""
println("The following calc script was executed by $operation.user.fullName: \n $calcScript")
return calcScript.toString()
