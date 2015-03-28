#
## Makefile for Electronic Classroom Tool prototype.
#

MODULES = 		chat \
			classroom \
			drawingtools \
			filemanager \
			layers \
			presentation \
			roster \
			taskbar 

FILES = 		chat/*.java \
			classroom/*.java \
			drawingtools/*.java \
			filemanager/*.java \
			layers/*.java \
			presentation/*.java \
			roster/*.java \
			taskbar/*.java

all:			compile jar doc

compile:		$(FILES)
			javac -g -d .classes $(FILES)

jar:			$(FILES)
			cd .classes ; \
			jar cmf ../manifest.txt classroom.jar */*.class $(MODULES) ; \
			chmod a+x classroom.jar ; \
			mv classroom.jar .. ; \
			cd ..

doc:
		javadoc \
			-private \
			-d .javadoc \
			-doctitle "Electronic Classroom Tool GUI Prototype" \
			-windowtitle "Electronic Classroom Tool GUI Prototype" \
			-overview overview.html \
			$(MODULES)
clean:
	rm -rf .classes/* .javadoc/* classroom.jar

