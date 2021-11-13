# 01-application-context
<html>
<body lang="en-US" link="#000080" vlink="#800000" dir="ltr"><p style="margin-bottom: 0in; line-height: 100%">
<font color="#3465a4"><font size="4" style="font-size: 16pt"><b>Spring
Application Context</b></font></font></p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><font size="3" style="font-size: 12pt"><u>01-xml-application-context</u></font></p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<ul>
	<li><p style="margin-bottom: 0in; line-height: 100%"><span style="background: transparent"><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><u><b>ClassPathXmlApplicationContext</b></u></font></font></font><font color="#000000">
	</font><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal">requires
	</span></font></font></font><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal">one
	or more XML</span></font></font></font><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal">
	configuration file to create application context, this configuration
	file contains bean definitions </span></font></font></font><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal">in
	XML format</span></font></font></font><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal">.</span></font></font></font></span></p>
	<li><p style="margin-bottom: 0in; line-height: 100%"><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal"><span style="background: transparent">Path
	notation “</span></span></font></font></font><font color="#2a00ff"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal"><span style="background: #e8f2fe">classpath:/beans/beans1.xml</span></span></font></font></font><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal"><span style="background: transparent">”</span></span></font></font></font></p>
</ul>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<ul>
	<li><p style="margin-bottom: 0in; background: transparent; line-height: 100%">
	<font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><u><b><span style="background: transparent">FileSystemXmlApplicationContext</span></b></u></font></font></font></p>
	<p style="margin-bottom: 0in; line-height: 100%"><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal"><span style="background: transparent">This
	file can be located on classpath or outside ( with absolute path),
	outside classpath is however discouraged. Use a property o code such
	path</span></span></font></font></font></p>
	<li><p style="margin-bottom: 0in; line-height: 100%"><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal"><span style="background: transparent">Path
	notation “</span></span></font></font></font><font color="#3f7f5f"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal"><span style="background: #e8f2fe">file:/home/../..</span></span></font></font></font><font color="#2a00ff"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal"><span style="background: #e8f2fe">/beans/beans1.xml</span></span></font></font></font><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal"><span style="background: transparent">”</span></span></font></font></font></p>
	<p style="margin-bottom: 0in; background: transparent; line-height: 100%">
	</p>
	<p style="margin-bottom: 0in; font-weight: normal; line-height: 100%">
	</p>
</ul>
<p style="margin-bottom: 0in; line-height: 100%"><font size="3" style="font-size: 12pt"><u>02-config-based-application-context</u></font></p>
<ul>
	<li><p style="margin-bottom: 0in; line-height: 100%"><span style="background: transparent"><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><b>AnnotationConfigApplicationContext</b></font></font></font><font color="#000000">
	</font><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal">requires
	a configuration file to create application context, this
	configuration file contains bean definitions.</span></font></font></font></span></p>
	<li><p style="margin-bottom: 0in; line-height: 100%"><span style="background: transparent"><font color="#000000"><font face="Monospace"><font size="2" style="font-size: 10pt"><span style="font-weight: normal">Or
	it requires a class containing @ComponentScan to discover all beans</span></font></font></font></span></p>
</ul>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
<p style="margin-bottom: 0in; line-height: 100%"><br/>

</p>
</body>
</html>

