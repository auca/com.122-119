DOCUMENT = COM_116_Fall_2016_Syllabus
DICTIONARY = en_US

.DEFAULT_GOAL := pdf

pdf : $(DOCUMENT).pdf

dvi : $(DOCUMENT).dvi

check : $(DOCUMENT).tex
	hunspell -d $(DICTIONARY) -t $<

$(DOCUMENT).pdf : $(DOCUMENT).tex
	pdflatex $<

$(DOCUMENT).dvi : $(DOCUMENT).tex
	latex $<

.PHONY : clean
clean :
	for ext in nav aux toc out snm log ; do\
	    rm -f $(DOCUMENT).$$ext ;\
	done
