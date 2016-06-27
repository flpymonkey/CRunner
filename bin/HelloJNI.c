#include <jni.h>
#include <conio.h>
#include <stdio.h>
#include "HelloJNI.h"

__declspec(dllexport) void JNICALL Java_HelloJNI_sayHello //changed to use for dll export? correct? 
  (JNIEnv *, jobject)
{
	printf("\nHello World!\n");
	return;
}