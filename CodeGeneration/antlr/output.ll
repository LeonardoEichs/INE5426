@.pstr = private unnamed_addr constant [4 x i8] c"%u\0A\00"
@.nstr = private unnamed_addr constant [5 x i8] c"-%u\0A\00"
define i32 @main() {
%t_0 = add i32 0, 42
%var = add i32 0, %t_0
call void @printSignedInt(i32 %var)
ret i32 %var}
declare i32 @printf(i8*, ...) #1
define void @printSignedInt(i32 %i) {
%t1 = lshr i32 %i, 31
%isNegative = trunc i32 %t1 to i1
br i1 %isNegative, label %PrintNegative, label %PrintPositive
PrintNegative:
  %t2 = zext i32 %i to i33
  %t3 = sub i33 4294967296, %t2
  %rep = trunc i33 %t3 to i32
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([5 x i8], [5 x i8]* @.nstr, i32 0, i32 0), i32 %rep)
  ret void
PrintPositive:
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.pstr, i32 0, i32 0), i32 %i)
  ret void
}