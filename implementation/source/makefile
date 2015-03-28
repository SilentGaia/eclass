#
## Makefile for Electronic Classroom Tool prototype.
#

PACKAGES = \
		eclasstool/model/chat \
		eclasstool/model/drawingtools \
		eclasstool/model/layers \
		eclasstool/model/presentation \
		eclasstool/model/roster \
		eclasstool/model/login \
		eclasstool/view/chat \
		eclasstool/view/classroom \
		eclasstool/view/drawingtools \
		eclasstool/view/drawingtools/images \
		eclasstool/view/layers \
		eclasstool/view/presentation \
		eclasstool/view/roster \
		eclasstool/view/login \
		eclasstool/view/taskbar \
                eclasstool/view/filemanager

RESOURCES = \
./eclasstool/view/layers/closedEye.png \
./eclasstool/view/layers/deleteLayer.png \
./eclasstool/view/layers/openEye.png \
./eclasstool/view/layers/addLayer.png \
./eclasstool/view/presentation/add.png \
./eclasstool/view/presentation/delete.png \
./eclasstool/view/presentation/image.png \
./eclasstool/view/presentation/pencil.png \
./eclasstool/model/presentation/presentation1/slide1.html \
./eclasstool/model/presentation/presentation1/slide2.html \
./eclasstool/model/presentation/presentation1/slide3.html \
./eclasstool/view/drawingtools/images/draw.png \
./eclasstool/view/drawingtools/images/shape.png \
./eclasstool/view/drawingtools/images/circle.png \
./eclasstool/view/drawingtools/images/note_color.png \
./eclasstool/view/drawingtools/images/rectangle.png \
./eclasstool/view/drawingtools/images/note.png \
./eclasstool/view/drawingtools/images/select_all.png \
./eclasstool/view/drawingtools/images/highlight_text.png \
./eclasstool/view/drawingtools/images/eraser.png \
./eclasstool/view/drawingtools/images/delete_shape.png \
./eclasstool/view/drawingtools/images/text_color.png \
./eclasstool/view/drawingtools/images/text.png \
./eclasstool/view/drawingtools/images/move_shape.png \
./eclasstool/view/drawingtools/images/color_swatch.png \
./eclasstool/view/drawingtools/images/line.png \
./eclasstool/view/roster/gc.png \
./eclasstool/view/roster/rc.png \
./eclasstool/view/roster/roster.in \
./eclasstool/view/roster/q.png \
./eclasstool/view/presentation/lectureMockup.html

MODULES = \
		eclasstool.model.chat \
		eclasstool.model.drawingtools \
		eclasstool.model.layers \
		eclasstool.model.presentation \
		eclasstool.model.roster \
		eclasstool.view.chat \
		eclasstool.view.classroom \
		eclasstool.view.drawingtools \
		eclasstool.view.layers \
		eclasstool.view.presentation \
		eclasstool.view.roster \
		eclasstool.view.taskbar \
                eclasstool.view.filemanager

FILES = 		eclasstool/model/chat/*.java \
			eclasstool/model/drawingtools/*.java \
			eclasstool/model/layers/*.java \
			eclasstool/model/presentation/*.java \
			eclasstool/model/roster/*.java \
			eclasstool/model/login/*.java \
			eclasstool/model/server/*.java \
			eclasstool/view/chat/*.java \
			eclasstool/view/drawingtools/*.java \
			eclasstool/view/layers/*.java \
			eclasstool/view/presentation/*.java \
			eclasstool/view/roster/*.java \
			eclasstool/view/login/*.java \
			eclasstool/view/classroom/*.java \
			eclasstool/view/taskbar/*.java \
			eclasstool/view/filemanager/*.java

all:			compile jar doc

compile:		$(FILES)
			javac -g -d .classes $(FILES)

jar:			$(FILES)
			cd .classes ; \
			jar cvmf ../manifest.txt classroom.jar */*/*/*.class $(PACKAGES) ; \
			chmod a+x classroom.jar ; \
			mv classroom.jar .. ; \
			cd ../ ; \
			jar uvf classroom.jar $(RESOURCES) ; \
			chmod a+x classroom.jar ; \

server:			$(FILES)
			cd .classes ; \
			jar cvmf ../serverManifest.txt server.jar */*/*/*.class $(PACKAGES) ; \
			chmod a+x server.jar ; \
			mv server.jar .. ; \
			cd ../ ; \
			jar uvf server.jar $(RESOURCES) ; \
			chmod a+x server.jar ; \

doc:
		javadoc \
			-private \
			-d javadoc \
			-doctitle "Electronic Classroom Tool GUI Prototype" \
			-windowtitle "Electronic Classroom Tool GUI Prototype" \
			-overview overview.html \
			$(MODULES) ; \
 		mv javadoc ../../design/javadoc ; 
clean:
	rm -rf .classes/* .javadoc/* classroom.jar ../../design/javadoc
