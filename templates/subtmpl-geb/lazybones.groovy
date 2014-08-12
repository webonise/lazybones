import org.apache.commons.io.FileUtils as FileSystem
import org.apache.commons.io.FilenameUtils as FileName

def params = [:]
params.folder = ask("What folder do you want this script in?", "src/run/geb", "folder")
params.name = ask("What is the name of the script?", null, "name")

// Ensure we have a ".geb" at the end
if(FileName.getExtension(params.name) != "geb") params.name += ".geb"

// Process the template file
processTemplates("template.geb", params)

// Get a handle on the template and destination files
File templateFile = new File(templateDir, "template.geb")
assert templateFile.file : "Could not find template file at $templateFile.canonicalPath"
File destinationFile = new File(new File(projectDir, params.folder), params.name)
assert !destinationFile.file : "File already exists at $destinationFile.canonicalPath"

// Ensure we have the necessary directory to move the file into
destinationFile.parentFile.mkdirs()

// Copy the file across
FileSystem.moveFile(templateFile, destinationFile)

// DONE!
println "Created your Geb script at $destinationFile"
