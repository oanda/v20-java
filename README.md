# OANDA v20 REST API - Java Reference Library

The Java Reference Library provides programmatic access to OANDA's next
generation v20 REST API and trading engine.

## Installation

The library is packaged as a Maven Project and is available from the Maven
Central Repository and via GitHub.

#### Maven

To add the library to an existing Maven project, add or update a <dependencies>
section in the pom.xml file as follows:

```
  <dependencies>
    <dependency>
      <groupId>com.oanda.v20</groupId>
      <artifactId>v20</artifactId>
      <version>3.0.22</version>
    </dependency>
  </dependencies>
```

#### GitHub

```
git clone https://github.com/oanda/v20-java.git
```

## Getting Started

This section will detail how to start a new project that uses the Java Reference
Library.  These instructions use the Eclipse IDE for Java Developers which can
be downloaded from http://www.eclipse.org/downloads/eclipse-packages/?show_instructions=TRUE#page-download

Once Eclipse is installed and launched, the following steps will walk through
creating a Maven or Java project that works with the v20 REST API.

##### Step 1 - Create a new project in Eclipse

###### Maven

To create a new Maven project, right-click/CTRL+click on the "Project Explorer"
window and select `New->Other` to bring up the New Wizard.  Expand "Maven" and
select "Maven Project" and click "Next".

On the "New Maven Project" dialog, check the box for `create a simple project`.
Fill out the location information or use the default location and click "Next".

On the next dialog, fill in the `Group Id`, `Artifact Id`, `Name` and
`Description` and click "Finish" to create the project and add it to the
"Project Explorer".

###### Java

To create a new Java project, right-click/CTRL+click on the "Project Explorer"
window and select `New->Java Project`.

On the "New Java Project" dialog, fill in the project name and location (or use
the default location).  Make sure the version of Java selected is 1.8.  Click
"Finish" to create the project

##### Step 2 - Add the v20 Java Reference Library

###### Maven

The next step is to add the v20 library as a dependency for your project.  To do
this, right-click/CTRL+click on the project in and select the `Maven->Add
Dependency` menu option.

Fill in the "Add Dependency" dialog with the correct information for the v20
library:

- Group Id: `com.oanda.v20`
- Artifact Id: `v20`
- Version: `3.0.22`

Click "OK" to complete adding the v20 library.

###### Java

The next step is to add the v20 library to the project workspace and create a
dependency between your project and the v20 library.  You must have cloned the
v20-java repository before performing this step (see installation above).

Once the v20-java repository is cloned, select `File->Import...`.  From the
Import dialog, expand "Maven" and highlight "Existing Maven Project" and click
"Next".

On the "Import Maven Projects" dialog, set the `Root Directory` to the location
where the v20-java repository was cloned.  In the "Projects" dialog you will see
the `pom.xml` file listed and checked.  Click "Finish" to import the v20
library.

Next, add v20-java as a dependency for your project.  In the "Project Explorer",
right-click/CTRL+click the entry for your project and select "Properties".  From
the property list, select "Java Build Path" and click on the "Projects" tab.
Click the "Add" button and check the v20-java project to add it as a dependency
for your project.  Click "OK" and then "Apply and Close" to finish.

##### Step 3 - Add a new Java class

In this step, we'll add a simple Java class to retrieve an account summary.
Start by adding a new class to the project as follows:

- Expand the project in the "Project Explorer"
- Highlight the `src/main/java` (Maven) or `src` (Java) entry
- Right-click/CTRL+click the entry and select `New->Class`

On the "New Class" dialog, set the "Name" field (e.g. Summary) and click the
`public static void main(String[] args)` check-box.  Click "Finish" to create
the new class.

##### Step 4 - Write the program

Edit the Summary.java file to contain the following:

```
import com.oanda.v20.Context;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.account.AccountSummary;

public class Summary {

	public static void main(String[] args) {
		Context ctx = new Context(
				"https://api-fxpractice.oanda.com",
				"<TOKEN>");

		try {
			AccountSummary summary = ctx.account.summary(
					new AccountID("<ACCOUNT_ID>")).getAccount();
			System.out.println(summary);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
```

Replace `<TOKEN>` with your API token and `<ACCOUNT_ID>` with your account ID.

##### Step 5 - Run the program

To execute the program, select the `Run` menu item or right-click/CTRL+click the
Summary.java file in the "Project Explorer" and select the `Run As->Java
Application` option.

Output similar to the following will be displayed in the Console window:

```
AccountSummary(id=<ACCOUNT_ID>, alias=V20Test, currency=CAD, balance=4999.7895,
createdByUserID=9999999, createdTime=2016-07-18T14:54:17.480159550Z, pl=-0.2097,
resettablePL=-0.2097, resettabledPLTime=null, commission=0.0000,
marginRate=0.02, marginCallEnterTime=null, marginCallExtensionCount=null,
lastMarginCallExtensionTime=null, openTradeCount=0, openPositionCount=0,
pendingOrderCount=0, hedgingEnabled=false, unrealizedPL=0.0000, NAV=4999.7895,
marginUsed=0.0000, marginAvailable=4999.7895, positionValue=0.0000,
marginCloseoutUnrealizedPL=0.0000, marginCloseoutNAV=4999.7895,
marginCloseoutMarginUsed=0.0000, marginCloseoutPercent=0.00000,
marginCloseoutPositionValue=0.0000, withdrawalLimit=4999.7895,
marginCallMarginUsed=0.0000, marginCallPercent=0.00000, lastTransactionID=633)
```

## Documentation

#### REST API

Documentation for the v20 REST API is available at http://developer.oanda.com/rest-live-v20/introduction

#### Java Reference Library

To view the documentation for the reference library, use the following:

###### Maven

If you created a Maven project that has the v20-java library as a depencency, in
the "Project Explorer" window, expand the project and then expand the "Maven
Dependencies" entries.  Right-click/CTRL+click on the v20.jar entry and select
`Maven->Open Javadoc`  The documentation for the Java Reference Library will
be displayed.

###### Java

If you added the v20-java repository to the workspace, you can build the Java
documentation.  Hightlight the v20-java project in the "Project Explorer" and
from the menu select `Project->Generate Javadoc...`.  Click "Finish" on the
"Generate Javadoc" dialog to generate the documentation and add it to the
project.

Once the documentation has been generated, expand the "doc" entry on the
v20-java project and open the `index.html` file to view the documentation.
