commandOut.print("\n\r ---scanning staring---\n\r");

if (properties.get("exitCode") != 0) {
	properties.put("Status", "Failure");
	}
else {
	var errors = "noerror"
	scanner.register("FAILED|Failed|failed|Error|error", function(lineNumber, line) {
	var value = line;
	//commandOut.print(lineNumber+":  "+value+"\n\r\t");
	errors=lineNumber+ ":" + line + "\n";
	});

	scanner.scan();

	if(errors == "noerror") {
	commandOut.print("perfect! no error log found\n")
	properties.put("Status", "Success");
	}else {
		commandOut.print("found some errors mark this deployment failure\n"+errors)
		properties.put("Status", "Failure");
	}

commandOut.print("\n\r ---scanning end---\n\r");
}
