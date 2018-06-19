@.pstr = private unnamed_addr constant [4 x i8] c"%u\0A\00"
@.nstr = private unnamed_addr constant [5 x i8] c"-%u\0A\00"
define i32 @main() {
%t_0 = add i32 0, 2
%t_1 = add i32 0, 2
%t_2 = icmp ne i32 %t_0, %t_1
br i1 %t_2, label %l_3, label %l_4
l_3:
%t_5 = add i32 0, 1
call void @printSignedInt(i32 %t_5)
br label %l_4
l_4:
%t_6 = add i32 0, 0
call void @printSignedInt(i32 %t_6)
%t_7 = add i32 0, 42
ret i32 %t_7}
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