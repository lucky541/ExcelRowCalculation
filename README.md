# ExcelRowCalculation

# Tools & Downloads
- Eclipse Neon https://www.eclipse.org/downloads/packages/release/neon/3/eclipse-ide-java-ee-developers Download and extract.
- Apache Tomcat 8.5 https://tomcat.apache.org/download-80.cgi Download and extract.
- Download the repository and extract.
# Set Up
- Launch the Eclipse in any workspace
- File->imports-> type maven in search-> select existing maven project-> next-> browse the extracted repository's folder-> next.
- Right Click on Imported project -> update maven.
- Right Click on Project -> Properties -> Deployment Assembly -> Add -> Java Build Path entities -> next -> Maven Dependencies -> Finish-Apply->Ok.
- Right Click on Project -> Run As -> Run on Server -> Apache -> Tomcat v8.5 Server -> Next -> Browse -> Apache extracted -> Finish.

# Test
- Navigate http://localhost:8080/DemoProject
- Add `/cal?s=YOUR_EXPRESSION" 
- And Enter
E.g. http://localhost:8080/DemoProject/cal?s=BAA <br>
output: {"result":"result 1379"}
