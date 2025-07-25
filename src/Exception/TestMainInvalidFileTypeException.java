package Exception;
class InvalidFileTypeException extends RuntimeException{
	public InvalidFileTypeException(String msg) {
		super(msg);
	}
	
}

class FileUploader{
	public static void upload(String fileName) {
		if(!fileName.toLowerCase().endsWith(".pdf")) {
			throw new InvalidFileTypeException("Only PDF files are allowed.");
			
		}
		System.out.println("File uploaded successfully: "+ fileName);
		
	}
}
public class TestMainInvalidFileTypeException {
	public static void main(String[] args) {
		FileUploader fu = new FileUploader();
		fu.upload("document.pdf");
		fu.upload("notes.docx");
		fu.upload("image.jpeg");
	}
}
